package Decorator;

public class HalloweenSkinDecorator extends SkinDecorator{
    public HalloweenSkinDecorator(Hero hero) {
        super(hero);
    }
    @Override
    public String getSkin(){
        return "Halloween";
    }

}
