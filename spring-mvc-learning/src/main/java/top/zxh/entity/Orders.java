package top.zxh.entity;

/**
 * Date:2023/3/9
 * Author：zxh
 * Description:包装 POJO
 */
public class Orders {
    private Integer orderId;
    private User user;

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }
}
