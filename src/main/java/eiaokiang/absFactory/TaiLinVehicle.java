package eiaokiang.absFactory;



/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */



class BeiJingTaiLinOm extends Vehicle {

    public BeiJingTaiLinOm(){
        name = "BeiJingTaiLinOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class BeiJingTaiLinEm extends Vehicle {

    public BeiJingTaiLinEm(){
        name = "BeiJingTaiLinEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}

class ShenZhenTaiLinOm extends Vehicle {

    public ShenZhenTaiLinOm(){
        name = "ShenZhenTaiLinOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class ShenZhenTaiLinEm extends Vehicle {

    public ShenZhenTaiLinEm(){
        name = "ShenZhenTaiLinEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}


