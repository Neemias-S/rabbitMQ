package com.puc.minas;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@EnableScheduling
public class Consumer {

    private final List<String> BaseDeEventos = new ArrayList<>();

    @RabbitListener(queues = "filaDeEventos")
    public void processarEvento(String evento) {
        System.out.println("Consumindo: " + evento);
        BaseDeEventos.add(evento);
    }

    @Scheduled(fixedRate = 30000)
    public void getDB(){
        System.out.println("\nXXXXXX\nEventos consumidos: " + BaseDeEventos.size() + "\nXXXXXX\n");
    }

}
