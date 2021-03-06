package com.tauanoliveira.cursoMC.config;

import java.text.ParseException;

import com.tauanoliveira.cursoMC.services.DBService;
import com.tauanoliveira.cursoMC.services.EmailService;
import com.tauanoliveira.cursoMC.services.SmtpEmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    
    @Autowired
    private DBService dbService;

@Value("${spring.jpa.hibernate.ddl-auto}")
private  String strategy;

    @Bean
    public Boolean instantiateDatabase() throws ParseException{

        if(!"create".equals(strategy)){
            return false;
        }

        dbService.instantiateTestDatabase();
        return true;
    }

    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }
}