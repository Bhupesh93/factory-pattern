/**
 * Created by sboob on 5/23/2016.
 */
public abstract class Ship {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ="Ship";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type="Ship";

    void floatOnWater(){
        System.out.println("the "+type+" named "+name+" is floating on water");
    };

}
