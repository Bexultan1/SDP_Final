package Decorator;

public class GoldenSkinDecorator extends SkinDecorator{
    public GoldenSkinDecorator(Hero hero)  {
        super(hero);
    }
    @Override
    public String getSkin(){
        return "Golden";
    }
}
