package Decorator;

public class GoldenSkinDecorator extends SkinDecorator{
    public GoldenSkinDecorator(Hero hero)  {
        super(hero);
    }
    @Override
    public void applySkin(Hero hero) {
        hero.setSkin("Golden");
    }
}
