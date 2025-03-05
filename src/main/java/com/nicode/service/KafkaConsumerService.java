package com.nicode.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaConsumerService(KafkaTemplate<String, String> template) {
        this.kafkaTemplate = template;
    }

    @KafkaListener(topics = "input-topic", groupId = "my-consumer-group")
    public void consume(String message) {
        System.out.println("Получено сообщение: " + message);

        String message2 = message.replaceAll("\\b\\d{1,3}\\b", "123");

        System.out.println("Отправлно сообщение: " + message2);

        kafkaTemplate.send("output-topic", message2);
    }
}

