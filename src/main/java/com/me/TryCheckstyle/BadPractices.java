package com.me.TryCheckstyle;

public class BadPractices {

    public static void main(String[] args) {
        BadMethod();
        System.out.println("Hello World");
    }

    static private void BadMethod() {
        if (true)
            System.out.println("");
        else
            System.out.println("");
    }
}
