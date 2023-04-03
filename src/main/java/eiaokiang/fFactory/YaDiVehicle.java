package eiaokiang.fFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */
public abstract class YaDiVehicle extends Vehicle{
}

class YaDiOm extends TaiLinVehicle {

    public YaDiOm(){
        name = "YaDiOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class YaDiEm extends TaiLinVehicle {

    public YaDiEm(){
        name = "YaDiEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}


