package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (dividend > 0 && divider > 0) {
            int result = dividend / divider;
            if (result == divider) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }
    }
}

