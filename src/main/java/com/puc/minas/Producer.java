package com.puc.minas;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private Integer contador = 0;

    @Scheduled(fixedRate = 5000)
    public void produzirEvento() {
        String evento = contador++ + "º Evento gerado";

        rabbitTemplate.convertAndSend( "filaDeEventos", evento );

        System.out.println(evento);
    }

}
