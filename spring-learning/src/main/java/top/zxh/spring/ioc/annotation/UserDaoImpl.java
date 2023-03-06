package top.zxh.spring.ioc.annotation;

import org.springframework.stereotype.Repository;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("userDao...save...");
    }
}
