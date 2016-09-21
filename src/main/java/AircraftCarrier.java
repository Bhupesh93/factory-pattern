/**
 * Created by sboob on 5/23/2016.
 */
public class AircraftCarrier  extends Ship{
    String name;
    String type;

    public AircraftCarrier(String name) {
        this.name = name;
        this.type = "aircraft carrier";
    }

    void floatOnWater(){
        System.out.println("the "+type+" named "+name+" is floating on water");
    };
}
