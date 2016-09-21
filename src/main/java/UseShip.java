/**
 * Created by sboob on 5/23/2016.
 */
public class UseShip {
    public static void main(String arg[]) {
          ShipFactory shipFactory =new ShipFactory();

        try {

            Class Destroy=Class.forName("Destroyer");
            Class AircraftCarrier=Class.forName("AircraftCarrier");
            shipFactory.registerAShip("Destroyer",Destroy);
            shipFactory.registerAShip("AircraftCarrier",AircraftCarrier);

            shipFactory.getShip("ship 1","AircraftCarrier").floatOnWater();
            shipFactory.getShip("ship 2","Destroyer").floatOnWater();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
