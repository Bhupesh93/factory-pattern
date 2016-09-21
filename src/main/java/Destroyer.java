/**
 * Created by sboob on 5/23/2016.
 */
public class Destroyer extends Ship {
    String name;
    String type;

    public Destroyer(String name) {
        this.name = name;
        this.type = "Destroyer";
    }

    void floatOnWater(){
        System.out.println("the "+type+" named "+name+" is floating on water");
    };



}
