package com.example.demo;

import Interface.IAddressBook;

public class AddressBook implements IAddressBook {

    @Override
    public String getAddress() {
        return "test";
    }
}
