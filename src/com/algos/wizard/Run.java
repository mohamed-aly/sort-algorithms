package com.algos.wizard;

public class Run {
    public static void main(String[] args) {
        Wizard wizard = new Wizard(5, 4, 6);
        Minion a = new Minion(8, 7);
        Minion b = new Minion(2, -1);
        Minion c = new Minion(9, 0);

        wizard.curse(a, b, c);
    }
}
