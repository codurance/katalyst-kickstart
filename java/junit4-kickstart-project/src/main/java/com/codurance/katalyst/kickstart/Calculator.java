package com.codurance.katalyst.kickstart;

public class Calculator {
    public int sum(int... args) {
        int result = 0;
        for (int arg: args) {
            result += arg;
        }
        return result;
    }
}
