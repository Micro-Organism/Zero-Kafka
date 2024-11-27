package com.zero.apache.kafka.common.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**   
 * 消费者监听topic=testTopic的消息
 */
@Component
public class ConsumerListener {
     
    @KafkaListener(topics = "testTopic")
    public void onMessage(String message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println("message: " + message);
    }

}