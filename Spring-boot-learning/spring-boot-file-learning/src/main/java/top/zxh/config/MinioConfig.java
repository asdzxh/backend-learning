package top.zxh.config;

import io.minio.*;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InvalidResponseException;
import io.minio.errors.ServerException;
import io.minio.errors.XmlParserException;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

/**
 * Date:2023/4/10
 * Author：zxh
 * Description:
 */
@Configuration
public class MinioConfig {

    @Value("${minio.endPoint}")
    private String endPoint;

    @Value("${minio.accessKey}")
    private String accessKey;

    @Value("${minio.secretKey}")
    private String secretKey;

    private MinioClient instance;


    @PostConstruct
    public void init() {
        instance = MinioClient.builder()
                .endpoint(endPoint)
                .credentials(accessKey, secretKey)
                .build();
    }

    /**
     * 判断bucket 是否存在
     * @param bucketName bucket名称
     * @return boolean
     */
    public boolean bucketExists(String bucketName) throws Exception{
        return instance.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }

    /**
     * 创建 bucket
     * @param bucketName
     * @throws Exception
     */
    public void makeBucket(String bucketName) throws Exception {
        boolean flag = bucketExists(bucketName);
        if(!flag){
            instance.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
    }

    public ObjectWriteResponse uploadObject(String bucketName,String objectName,String filePath) throws  Exception{
        return instance.uploadObject(UploadObjectArgs.builder().bucket(objectName).filename(filePath).build());
    }
    public ObjectWriteResponse putObject(String bucketName, String objectName, InputStream inputStream) throws Exception {
        return instance.putObject(PutObjectArgs.builder().bucket(bucketName).object(objectName).stream(inputStream,-1,10485760).build());
    }

    public void removeObject(String bucketName,String objectName) throws Exception {
        instance.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(objectName).build());
    }
}
