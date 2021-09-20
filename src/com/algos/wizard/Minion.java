package com.algos.wizard;

public class Minion extends Character {

    public Minion(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return String.format("Minion (%s, %s)", this.getX(), this.getY());
    }
}
