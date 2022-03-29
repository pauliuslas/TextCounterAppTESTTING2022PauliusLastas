package com.example.textcounterapp2022pauliuslastas;

public class TextUtils {
    public static int getCharsCount(String input) {
        return input.length();
    }
    public static int getWordsCount(String input) { return input.split("\\w+").length; }
}

