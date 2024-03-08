package com.store.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public static String convertToObject(String message){
        return "";
    }

    public static String constructContent(){return "";};

    public static void sendEmail(String content, String eail){};
}
