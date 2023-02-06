package com.stackroute.demotwilloSMS.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {
    @GetMapping(value = "/sendSMS")
    public ResponseEntity<String> sendSMS() {

        Twilio.init("enter your username", "enter your password");

        Message.creator(new PhoneNumber("enter receiver number"),
                new PhoneNumber("enter sender number"), "Hello from Twilio 📞").create();

        return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
}
