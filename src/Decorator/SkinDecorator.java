package Decorator;
public class SkinDecorator implements IHero {
    protected Hero hero;
    public SkinDecorator(Hero hero){
      this.hero = hero;
    }

    @Override
    public void setSkin(String skin) {

    }

    @Override
    public String getSkin() {
        return this.hero.getSkin();
    }

    @Override
    public void performSpecialMove() {
        this.hero.performSpecialMove();
    }

    @Override
    public void performFatality() {
        this.hero.performFatality();
    }

    @Override
    public void display() {

    }
}
