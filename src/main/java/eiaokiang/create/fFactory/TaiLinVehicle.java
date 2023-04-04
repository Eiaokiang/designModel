package eiaokiang.create.fFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */
public abstract class TaiLinVehicle extends Vehicle {
}

class TaiLinOm extends TaiLinVehicle {

    public TaiLinOm(){
        name = "TaiLinOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class TaiLinEm extends TaiLinVehicle {

    public TaiLinEm(){
        name = "TaiLinEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}


