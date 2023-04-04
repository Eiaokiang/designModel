package eiaokiang.create.absFactory;



/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */


class BeiJingYaDiOm extends Vehicle {

    public BeiJingYaDiOm(){
        name = "BeiJingYaDiOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class BeiJingYaDiEm extends Vehicle {

    public BeiJingYaDiEm(){
        name = "BeiJingYaDiEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}

class ShenZhenYaDiOm extends Vehicle {

    public ShenZhenYaDiOm(){
        name = "ShenZhenYaDiOm";
    }

    @Override
    public void speical() {
        System.out.println("NFC");
    }
}

class ShenZhenYaDiEm extends Vehicle {

    public ShenZhenYaDiEm(){
        name = "ShenZhenYaDiEm";
    }

    @Override
    public void speical() {
        System.out.println("智能解锁");
    }
}

