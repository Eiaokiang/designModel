package eiaokiang.simpleFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */
public abstract class YaDiVehicle {
    protected String name;

    public abstract void speical();

    public void run(){
        System.out.println("跑动");
    }

}

class YaDiOm extends YaDiVehicle {

    public YaDiOm(){
        name = "YaDiOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class YaDiEm extends YaDiVehicle {

    public YaDiEm(){
        name = "YaDiEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}


