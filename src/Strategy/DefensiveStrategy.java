package Strategy;

public class DefensiveStrategy implements FightStrategy {
    @Override
    public void performAttack() {
        System.out.println("Performing a defensive attack.");
    }
}
