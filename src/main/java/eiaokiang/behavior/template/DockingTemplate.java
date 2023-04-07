package eiaokiang.behavior.template;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:51 2023/4/7
 */
public abstract class DockingTemplate {

    //进货流程 固定 不可重写
    public final void docking(){
        order();
        prepay();
        getVehicles();
        payAll();
    }


    public abstract void order();

    /**
     * 非必要流程提供默认空实现
     */
    public void prepay(){

    }

    public abstract void getVehicles();

    /**
     * 通用逻辑
     */
    public void payAll(){
        System.out.println("微信付全款");
    }

}


class YaDiDocking extends DockingTemplate{

    @Override
    public void order() {
        System.out.println("在雅迪平台下单");
    }

    @Override
    public void prepay() {
        System.out.println("给雅迪平台预付款");
    }

    @Override
    public void getVehicles() {
        System.out.println("雅迪工厂发车");
    }
}


class TaiLinDocking extends DockingTemplate{

    @Override
    public void order() {
        System.out.println("在台铃平台下单");
    }

    @Override
    public void getVehicles() {
        System.out.println("台铃工厂发车");
    }
}