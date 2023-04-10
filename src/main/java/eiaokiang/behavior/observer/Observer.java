package eiaokiang.behavior.observer;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:04 2023/4/10
 */
public interface Observer {
    String getName();
    void update(String msg);

}


class XpVehicleShop implements Observer{

    String name;

    public XpVehicleShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String msg) {
        if (msg.equals("em3新款来货")){
            System.out.println("xp店马上抢购");
        }else{
            System.out.println("xp店不缺该车型");
        }

    }
}

class TzVehicleShop implements Observer{

    String name;

    public TzVehicleShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String msg) {
        if (msg.equals("om3新款来货")){
            System.out.println("tz店马上抢购");
        }else{
            System.out.println("tz店不缺该车型");
        }
    }
}