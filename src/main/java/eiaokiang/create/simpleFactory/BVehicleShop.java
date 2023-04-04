package eiaokiang.create.simpleFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:58 2023/4/3
 */
public class BVehicleShop {

    //使用
    //public Vehicle sale(String vehicleName){
    //    if (vehicleName == "YaDi"){
    //        return new YaDi();
    //    }else {
    //        return new TaiLin();
    //    }
    //}


    //使用工厂方法
    public void sale(String vehicleName){
        System.out.println("BVehicleShop sale a "+ YaDiVehicleFactory.getVehicle(vehicleName).name);
    }
}
