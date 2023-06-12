package top.zxh.websocket;

import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date:2023/4/17
 * Author：zxh
 * Description: SpringBoot 服务端 WebSocket 服务接收类
 */
@Component
@ServerEndpoint(value = "/socket/{id}")
@Slf4j
public class WebSocketServer {
    /**
     * 静态变量，用来统计在线连接数
     */
    private static int olineCount = 0;

    private Integer id;

    /**
     * 与某个客户端连接的会话，存放了和客户端连接对应的 WebSocket 对象
     */
    private Session session;

    /**
     * concurrent包：线程安全的集合，用来存放和每个客户端对应的WebSocket 对象
     */
    public static ConcurrentHashMap<Integer, WebSocketServer> map = new ConcurrentHashMap<>();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(@PathParam(value = "id") Integer id, Session session) {
        //接收到编号
        this.id = id;
        this.session = session;
        //加入集合
        map.put(id, this);

        //在线人数+1
        addOnlineCount();
        log.info("有新连接加入，当前在线人数为" + getOnlineCount());
        sendMessage("----连接以成功建立---");


    }

    @OnClose
    public void onClose() {
        log.info("有连接关闭，当前在线人物为：" + getOnlineCount());
        //从map移出
        map.remove(id);
        //当前在线人数减一
        subOnlineCount();
    }

    /**
     * 收到客户端发送的消息，调用的方法
     *
     * @param session
     * @param msg
     */
    @OnMessage
    public void onMessage(Session session, String msg) {
        log.info("接收到客户端发送的消息" + msg);
        this.sendMessage(msg);


    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.error(error.getMessage());
    }

    private void sendMessage(String msg) {
        try {
            getSession().getBasicRemote().sendText(msg);
        } catch (IOException e) {
            log.error("发生错误");
        }

    }

    /**
     * 给指定id发消息
     * @param id
     * @param msg
     */
    private void senMessageById(Integer id,String msg){
        WebSocketServer webSocketServer = map.get(id);
        if (map.get(id)!=null){
            webSocketServer.sendMessage(msg);
        }else {
            log.info("客户端已下线，不能发送消息");
        }
    }

    public Session getSession() {
        return session;
    }

    /**
     * 通过 synchronized 给方法加锁，实现线程安全
     */
    public static synchronized void addOnlineCount() {
        WebSocketServer.olineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.olineCount--;
    }

    public static synchronized int getOnlineCount() {
        return WebSocketServer.olineCount;
    }
}
