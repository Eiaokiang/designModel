package eiaokiang.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:26 2023/4/10
 */
public class VehicleIterator implements Iterable {

    List<Vehicle> vehicleList = new ArrayList<>();

    public VehicleIterator(){
        vehicleList.add(new Vehicle("EM3","001"));
        vehicleList.add(new Vehicle("EM3","002"));
        vehicleList.add(new Vehicle("REX","003"));
        vehicleList.add(new Vehicle("EM3","003"));
    }




    @Override
    public Iterator iterator() {
        return new vit();
    }

    private class vit implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if (index < vehicleList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return vehicleList.get(index++);
            }
            return null;
        }
    }

}
