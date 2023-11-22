package Decorator;

public class DefaultSkinDecorator extends SkinDecorator{
    public DefaultSkinDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public String getSkin() {
        return "Default";
    }
}
