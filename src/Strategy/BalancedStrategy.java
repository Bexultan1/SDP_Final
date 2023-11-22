package Strategy;

public class BalancedStrategy implements FightStrategy {
    @Override
    public void performAttack() {
        System.out.println("Performing a balanced attack.");
    }
}
