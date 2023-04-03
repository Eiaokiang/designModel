package eiaokiang.absFactory;


/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:27 2023/4/3
 */
public interface VehicleFactory {
    //使用工厂方法，只需要创建多一个电动车类，并在此修改即可，电动车店不需要修改售卖方法
     Vehicle getVehicle(String name);
}


class ShenZhenVehicleFactory implements VehicleFactory {

    public Vehicle getVehicle(String name) {
        Vehicle vehicle = null;
        if (name.equals("TaiLinEm")) {
            vehicle = new ShenZhenTaiLinEm();
        } else if (name.equals("TaiLinOm")) {
            vehicle = new ShenZhenTaiLinOm();
        } else if (name.equals("YaDiEm")) {
            vehicle = new ShenZhenYaDiEm();
        } else if (name.equals("YaDiOm")) {
            vehicle = new ShenZhenYaDiOm();
        }
        return vehicle;
    }
}

class BeiJingVehicleFactory implements VehicleFactory {

    public Vehicle getVehicle(String name) {
        Vehicle vehicle = null;
        if (name.equals("TaiLinEm")) {
            vehicle = new BeiJingTaiLinEm();
        } else if (name.equals("TaiLinOm")) {
            vehicle = new BeiJingTaiLinOm();
        } else if (name.equals("YaDiEm")) {
            vehicle = new BeiJingYaDiEm();
        } else if (name.equals("YaDiOm")) {
            vehicle = new BeiJingYaDiOm();
        }
        return vehicle;
    }
}

class ShanghaiVehicleFactory implements VehicleFactory {

    public Vehicle getVehicle(String name) {
        Vehicle vehicle = null;
        if (name.equals("HuaYan")) {
            vehicle = new ShangHaiHuaYan();
        }
        return vehicle;
    }
}