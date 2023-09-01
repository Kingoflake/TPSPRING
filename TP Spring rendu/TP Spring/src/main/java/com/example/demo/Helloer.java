package com.example.demo;

import Interface.HelloerInt;
import Interface.Printing;
import java.io.Console;

public class Helloer implements HelloerInt {
    public Printing printer;

    public void setPrinter(Printing printer) {
        this.printer = printer;
    }

    @Override
    public void sayHello() {
        System.out.println(this.printer.printHello());
    }
}
