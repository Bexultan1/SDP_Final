package Observer;

public class Player implements Observer {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String news) {
        System.out.println(playerName + " received news: " + news);
    }
}