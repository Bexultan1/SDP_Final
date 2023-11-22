package Strategy;

public class AggressiveStrategy implements FightStrategy {
    @Override
    public void performAttack() {
        System.out.println("Performing an aggressive attack.");
    }
}

