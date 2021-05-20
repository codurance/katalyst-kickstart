package com.codurance.katalyst.kickstart;

public class Summator {
    public int sum(int... args) {
        int result = 0;
        for (int arg: args) {
            result += arg;
        }
        return result;
    }
}
