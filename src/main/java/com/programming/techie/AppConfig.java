package com.programming.techie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.programming.techie")
public class AppConfig {

    @Bean(name = "basicSpellChecker", initMethod = "init", destroyMethod = "destroy")
    public BasicSpellChecker createBasicSpellChecker() {
        return new BasicSpellChecker();
    }
//
//    @Bean(name = "advancedSpellChecker")
//    public AdvancedSpellChecker createAdvancedSpellChecker() {
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "emailClient")
//    public EmailClient createEmailClient() {
//        EmailClient emailClient = new EmailClient();
    // EmailClient emailClient = new EmailClient(createBasicSpellChecker();

    // setter injection using config class ioc
//        emailClient.setSpellChecker(createAdvancedSpellChecker());
//        return emailClient;
//    }
}
