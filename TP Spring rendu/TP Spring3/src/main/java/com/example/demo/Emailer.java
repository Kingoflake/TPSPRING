package com.example.demo;

import Interface.Emailing;
import Interface.IAddressBook;
import Interface.IEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emailer implements Emailing {
    @Autowired
    public IEditor editor;
    @Autowired
    public IAddressBook addressBook;


    public void setAddressBook(IAddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void setEditor(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void send() {

        String message = editor.getMessage();
        String address = addressBook.getAddress();

    }
}
