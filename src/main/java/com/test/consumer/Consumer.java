package com.test.consumer;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)
public class Consumer {

    @StreamListener(Sink.INPUT)
    public void receive(String data) {
        System.out.println("Data received from producer..." + data);
    }
}
