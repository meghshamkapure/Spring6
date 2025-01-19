package org.example;

public class Player {
    private String name;
    private int ranking;

    Player(){
        System.out.println("Player Object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
