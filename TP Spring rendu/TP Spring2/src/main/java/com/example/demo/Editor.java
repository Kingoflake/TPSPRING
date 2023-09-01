package com.example.demo;

import Interface.IEditor;

public class Editor implements IEditor {


    public String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
