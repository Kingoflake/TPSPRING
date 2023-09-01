package com.example.demo;

import Interface.IAddressBook;
import org.springframework.stereotype.Component;

@Component
public class AddressBook implements IAddressBook {

    @Override
    public String getAddress() {
        return "test";
    }
}
