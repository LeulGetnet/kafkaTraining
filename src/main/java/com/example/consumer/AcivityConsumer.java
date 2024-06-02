package com.example.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class AcivityConsumer {

    @KafkaListener(topics = "userActivity", groupId = "user-group1")
    public void listenmessage(String message){
        System.out.println("message recive "+ message);

    }

}

