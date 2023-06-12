package top.zxh.service;

import freemarker.template.Template;
import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import top.zxh.entity.Article;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/4/18
 * Author：zxh
 * Description:
 */
@SpringBootTest
class MailServiceTest {

    @Resource
    private MailService mailService;

    @Resource
    FreeMarkerConfig freeMarkerConfig;

    @Test
    void sendSimpleMail() {

        mailService.sendSimpleMail("2832009432@qq.com", "aaa", "测试文本");
    }

    @Test
    void senHtmlMail() throws MessagingException {
        mailService.sendHtmlMail("2832009432@qq.com", "快乐每一天", """
                <body>
                <div>
                  <p>自责要短暂，不过要长久铭记。 --当你沉睡时</p>
                  <a href="http://zuoshoutianxia6484.lofter.com/?page=2&t=1524013006934">每日一言</a><br>
                  <img src="https://cn.bing.com//th?id=OHR.MPPUnesco_ZH-CN8076198158_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp&w=240&h=135">
                </div>
                </body>""");
    }

    @Test
    void sendFreemarkerMail() throws Exception {
        List<Article> articles = List.of(
                new Article(1,"Spring",new Date()),
                new Article(2,"Spring MVC",new Date()),
                new Article(3,"Spring Boot",new Date())
        );
        Template template = freeMarkerConfig.getConfiguration().getTemplate("mail-temp.ftl");
        Map<String, Object> map = new HashMap<>();
        map.put("articles", articles);
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template,map);
        mailService.sendHtmlMail("2832009432@qq.com","这是一封FreeMarker模版引擎邮件",content);
    }
}