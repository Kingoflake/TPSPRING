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
        builder.headless(false);
        builder.run(args);
        ApplicationContext ctx = builder.run(args);
        Spellchecker spellchecker = ctx.getBean(Spellchecker.class);
        Editor editor = ctx.getBean(Editor.class);
        Emailer emailer = ctx.getBean(Emailer.class);

        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] word = input.split(" ");
        if (spellchecker.check(word[0])) {

            String message = JOptionPane.showInputDialog(null,"Écrire le mail",null);
            editor.setMessage(message);
            emailer.send();


        }

        else {
            System.out.println("erreur de saisie");

        }




    }

}
