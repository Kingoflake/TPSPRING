package com.example.demo;

import Interface.ISpellchecker;

public class  Spellchecker implements ISpellchecker {

    private static final String[] WORDS = new String[]{"emailer", "jb", "coucou"};


    @Override
    public boolean check(String word) {
        int i = 0;
        boolean ret = false;
        word.split("");


        while ((i < WORDS.length) && !ret) {
            ret = WORDS[i].equalsIgnoreCase(word);

            i++;
        }

        return ret;
    }
}