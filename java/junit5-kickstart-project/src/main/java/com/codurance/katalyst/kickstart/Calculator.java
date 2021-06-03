package com.codurance.katalyst.kickstart;

public class Calculator {
    public int sum(int... numbers) {
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }
}
