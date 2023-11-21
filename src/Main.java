import Singleton.* ;
import Observer.*;
import Decorator.*;
import Factory.*;

// Decorator Pattern
class GoldenSkinDecorator implements Skin {
    private Skin decoratedSkin;

    public GoldenSkinDecorator(Skin decoratedSkin) {
        this.decoratedSkin = decoratedSkin;
    }

    @Override
    public void applySkin() {
        decoratedSkin.applySkin();
        System.out.println("Applying golden skin.");
    }
}


// Strategy Pattern
interface FightStrategy {
    void performFight();
}

class AggressiveStrategy implements FightStrategy {
    @Override
    public void performFight() {
        System.out.println("Fighting aggressively.");
    }
}

class DefensiveStrategy implements FightStrategy {
    @Override
    public void performFight() {
        System.out.println("Fighting defensively.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Observer
        NewsAgency newsAgency = new NewsAgency();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        newsAgency.addObserver(player1);
        newsAgency.addObserver(player2);

        newsAgency.notifyObservers("New Mortal Kombat update!");

        // Decorator
        Skin player1Skin = new DefaultSkin();
        player1Skin.applySkin();

        Skin player2Skin = new GoldenSkinDecorator(new DefaultSkin());
        player2Skin.applySkin();

        // Factory
        MapFactory mapFactory = new MapFactory();
        mapFactory.loadMap("New Year");

        // Strategy
        FightStrategy aggressiveStrategy = new AggressiveStrategy();
        aggressiveStrategy.performFight();

        FightStrategy defensiveStrategy = new DefensiveStrategy();
        defensiveStrategy.performFight();

        // Singleton
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        databaseConnection1.connect();
        databaseConnection2.connect();
    }
}
