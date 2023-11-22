import Singleton.* ;
import Observer.*;
import Decorator.*;
import Factory.*;
import Adapter.*;
import Strategy.*;

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
        Hero SubZero = new Hero("Sub-Zero");
        System.out.println(SubZero.getSkin());



        // Factory
        MapFactory mapFactory = new MapFactory();
        mapFactory.loadMap("New Year");

        // Strategy
        Hero Scorpion= new Hero("Sub-Zero");
        Scorpion.setFightStrategy(new AggressiveStrategy());

        Scorpion.performSpecialMove();
        Scorpion.performFatality();

        // Singleton
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.connect();

        // Adapter
        Game mortalKombat = new MortalKombatGame();
        GermanyServer adapter = new VPNAdapter(mortalKombat);

        adapter.connectToGermanyServer();

    }
}
