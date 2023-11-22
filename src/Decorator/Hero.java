package Decorator;
import Strategy.*;

import Decorator.*;
public class Hero implements IHero{
    private String name;
    private String skin;

    public Hero(String name) {
        this.name = name;
        this.skin = "Default";
    }
    private FightStrategy fightStrategy;
    public void setFightStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
    public String getSkin(){return skin;}

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