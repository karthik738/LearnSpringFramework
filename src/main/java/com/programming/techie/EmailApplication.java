package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {
        // EmailClient emailClient=new EmailClient(); // Without springboot, creating object manually

        // Depedency Injection
        // EmailClient emailClient=new EmailClient(new BasicSpellChecker()); // loosely coupled
        // EmailClient emailClient=new EmailClient(new AdvancedSpellChecker()); // loosely coupled

        
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
        emailClient.sendEmail("Hey, " +
                "This is my first email message.");
        emailClient.sendEmail("Hey, " +
                "This is my second email message.");

        // Bean Scopes
        AdvancedSpellChecker advancedSpellChecker = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker);
        AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker1);

        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();
        // to listen to events at shutdown, we need to register shutdown hook - which will execute our statements inside our destroy method 
        // we need to downcast application context to implementation class and call the register shutdown hook method
    }
}
