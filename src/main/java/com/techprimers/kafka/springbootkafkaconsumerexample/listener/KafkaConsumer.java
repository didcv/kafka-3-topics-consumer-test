package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "ionut1", group = "ionut1_group")
    public void consume(String message) {
        System.out.println("Consumed message ionut1: " + message);
    }


    @KafkaListener(topics = "ionut2", group = "ionut1_group",containerFactory = "ionut2KafkaListenerFactory")
    public void consumeionut2(String message) {
        System.out.println("Consumed message ionut2: " + message);
    }

    @KafkaListener(topics = "ionut3", group = "ionut1_group",containerFactory = "ionut3KafkaListenerFactory")
    public void consumeionut3(String message) {
        System.out.println("Consumed message ionut3: " + message);
    }

}
