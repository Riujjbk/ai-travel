package com.ui.ailvyou.invoke;


import com.ui.ailvyou.app.TravelApp;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest(properties = {
        "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
})
class TravelAppTest {

    @Resource
    private TravelApp travelApp;


    @Test
    void testChat(){
        String chatId = UUID.randomUUID().toString();

        String  message = "你好，我是大学生";
        String answer = travelApp.doChat(message, chatId);

        Assertions.assertNotNull(answer);  // 检查变量 answer 是否为非 null

        message = "我喜爱徒步，我想走太行山路线";
        answer = travelApp.doChat(message,chatId);

        Assertions.assertNotNull(answer);  // 检查变量 answer 是否为非 null

        message = "我要去哪里旅游";
        answer = travelApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);  // 检查变量 answer 是否为非 null


    }


}
