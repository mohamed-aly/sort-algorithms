package com.algos.wizard;

public class Wizard extends Character {
    private int spellRange;

    public Wizard(int x, int y, int spellRange) {
        super(x, y);
        this.spellRange = spellRange;
    }

    public void curse(Minion... minions) {
        for (Minion minion : minions) {
            double distance = Math.sqrt(Math.pow(this.getX() - minion.getX(), 2) + Math.pow(this.getY() - minion.getY(), 2));
            System.out.println(minion +" Distance is "+ distance);
            String state = distance <= this.spellRange ? " is Cursed" : "is not Cursed";
            System.out.println(minion + state);
        }
    }
}
