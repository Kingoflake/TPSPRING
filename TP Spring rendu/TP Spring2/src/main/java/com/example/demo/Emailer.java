package com.example.demo;

import Interface.Emailing;
import Interface.IAddressBook;
import Interface.IEditor;

public class Emailer implements Emailing {
    public IEditor editor;
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
