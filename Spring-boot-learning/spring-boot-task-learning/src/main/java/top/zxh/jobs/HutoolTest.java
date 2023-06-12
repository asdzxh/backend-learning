package top.zxh.jobs;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:
 */
@Component
@Slf4j
public class HutoolTest {
    /**
     * 生成普通类型的二维码
     */

    private static int a = 1;

    @Scheduled(fixedDelay = 3000)
    public static void generateGeneralQrCode() {
        log.info("生成第"+a+"个二维码");
        // 三个参数分别是 扫码内容 宽高
        QrCodeUtil.generate(String.valueOf(a),
                500, 500,
                // 生成路径 切记换成自己的
                FileUtil.file("C:\\Users\\HP\\Desktop\\image\\" + '1' + ".jpg"));

        a++;
    }


}
