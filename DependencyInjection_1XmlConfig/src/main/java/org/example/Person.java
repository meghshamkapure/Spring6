package org.example;

public class Person {
    private Developer dev;
    private Player player;

    public Person(Developer dev, Player player) {
        this.dev = dev;
        this.player = player;
    }

    void showPerson(){
        System.out.println(dev.toString());
        System.out.println(player.toString());
    }
}
