package Decorator;
public class SkinDecorator implements HeroSkin {
    protected Hero hero;
    public SkinDecorator(Hero hero){
        this.hero = hero;
    }

    @Override
    public void applySkin(Hero hero) {

    }
}
