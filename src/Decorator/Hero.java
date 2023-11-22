package Decorator;

import Decorator.*;
public class Hero {
    private String name;
    private String skin;

    public Hero(String name) {
        this.name = name;
        this.skin = "Default";
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void performSpecialMove() {
        System.out.println(name + " performs a special move.");
    }

    public void performFatality() {
        System.out.println(name + " performs a fatality.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Skin : " + skin);
    }
}