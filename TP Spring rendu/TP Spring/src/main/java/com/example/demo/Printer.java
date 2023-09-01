package com.example.demo;

import Interface.Printing;

public class Printer  implements Printing {


    @Override
    public String printHello() {
        return "Hello";
    }
}
