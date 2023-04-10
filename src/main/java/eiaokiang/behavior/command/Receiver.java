package eiaokiang.behavior.command;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:54 2023/4/10
 */

/**
 * 实际接收者
 */

class FrontDesk{

    public void makeOrder(){
        System.out.println("前台打印订单");
    }

    public void undoMakeOrder(){
        System.out.println("前台停止打印订单");
    }
}

class Worker{

    public void assembleVehicle(){
        System.out.println("师傅组装车辆");
    }

    public void undoAssembleVehicle(){
        System.out.println("师傅停止组装车辆");
    }
}