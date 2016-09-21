import jdk.nashorn.internal.objects.annotations.Constructor;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sboob on 5/23/2016.
 */
public class ShipFactory {

   HashMap shipTypeToClass =new HashMap();

    void registerAShip(String type,Class ship){
        shipTypeToClass.put(type,ship);
    }

    Ship getShip(String name,String type){

        Class ship=(Class)shipTypeToClass.get(type);

        java.lang.reflect.Constructor shipConstructor;
        try {
            shipConstructor=ship.getDeclaredConstructor(new Class[]{String.class});
            return (Ship) shipConstructor.newInstance(name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }


}
