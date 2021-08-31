package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee programmer = context.getBean("Programmer", Employee.class);

        String message = "Programmers say: " + programmer.getDescription();


        System.out.println(message);


    }









    }

