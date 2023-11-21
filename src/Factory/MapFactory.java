package Factory;

public class MapFactory {
    public void loadMap(String name){
        if(name.equalsIgnoreCase("Classic")){
            (new ClassicMap()).loadMap();
        } else if (name.equalsIgnoreCase("New Year")){
            (new NewYearMap()).loadMap();
        } else if (name.equalsIgnoreCase("Hell")) {
            (new HellMap()).loadMap();
        }
    }

}
