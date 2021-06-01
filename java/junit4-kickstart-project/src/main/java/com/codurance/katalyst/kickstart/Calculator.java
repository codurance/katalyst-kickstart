package com.codurance.katalyst.kickstart;

public class Calculator {

    public int sum(int... numbers) {
        int result = 0;
        for (int arg: numbers) {
            result += arg;
        }
        return result;
    }

}
