package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Helloer helloer = ctx.getBean(Helloer.class);

        helloer.sayHello();



    }

}
