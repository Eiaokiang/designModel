package eiaokiang.struct.facade;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:50 2023/4/6
 */
public class UserBuy {

    BuyCar buyCar = new BuyCar();
    Ticket ticket = new Ticket();
    WashCar washCar = new WashCar();


    public void userBuy(){
        buyCar.buyCar();
        ticket.getTicket();
        washCar.washCar();
    }

}



class BuyCar{

    public void buyCar(){
        System.out.println("买车");
    }
}

class Ticket{

    public void getTicket(){
        System.out.println("拿发票");
    }
}

class WashCar{

    public void washCar(){
        System.out.println("洗车");
    }
}



