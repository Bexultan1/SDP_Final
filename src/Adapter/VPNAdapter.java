package Adapter;

// Адаптер для VPN
public class VPNAdapter implements GermanyServer,JapanServer {
    private final Game game;

    public VPNAdapter(Game game) {
        this.game = game;
    }

    @Override
    public void connectToGermanyServer() {
        game.play();
        System.out.println("Connection to German server");
    }

    @Override
    public void connectToJapanServer() {
        game.play();
        System.out.println("Connection to Japan server");
    }
}
