package Adapter;

public class MortalKombatGame implements Game {
    @Override
    public void play() {
        System.out.println("Fight!");
    }
}
