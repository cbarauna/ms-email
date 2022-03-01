package com.ms.email.consumers;


import com.ms.email.dtos.EmailDTO;
import com.ms.email.models.EmailModel;
import com.ms.email.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService service;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDTO dto) {
        EmailModel model = new EmailModel();
        BeanUtils.copyProperties(dto, model);
        service.sendEmail(model);
        System.out.println("Email Status: " + model.getStatusEmail());
    }
}
