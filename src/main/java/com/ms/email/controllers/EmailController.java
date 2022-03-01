package com.ms.email.controllers;

import com.ms.email.dtos.EmailDTO;
import com.ms.email.models.EmailModel;
import com.ms.email.service.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {

    @Autowired
    private EmailService service;


    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sedingEmail(@RequestBody @Valid EmailDTO emailDTO) {
        EmailModel model = new EmailModel();
        BeanUtils.copyProperties(emailDTO, model);
        service.sendEmail(model);
        return  new ResponseEntity<>(model, HttpStatus.CREATED);
    }
}
