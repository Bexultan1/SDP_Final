package Decorator;

public class DefaultSkin implements Skin {
    @Override
    public void applySkin() {
        System.out.println("Applying default skin.");
    }
}