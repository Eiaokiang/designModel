package eiaokiang.behavior.observer;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:54 2023/4/10
 */

/**
 * 观察者模式（发布-订阅模式）
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject vehiclePlatfrom = new VehiclePlatfrom();

        Observer xpVehicleShop = new XpVehicleShop("小胖电动车");

        Observer tzVehicleShop = new TzVehicleShop("兔子电动车");

        vehiclePlatfrom.add(xpVehicleShop);
        vehiclePlatfrom.add(tzVehicleShop);

        vehiclePlatfrom.notifyState("em3新款来货");

    }
}
