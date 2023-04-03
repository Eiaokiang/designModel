package eiaokiang.absFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:58 2023/4/3
 */
public class CVehicleShop {

    //使用
    //public Vehicle sale(String vehicleName){
    //    if (vehicleName == "YaDi"){
    //        return new YaDi();
    //    }else {
    //        return new TaiLin();
    //    }
    //}


    //使用工厂方法
    public void sale(String vehicleName,VehicleFactory factory){
        System.out.println("CVehicleShop sale a "+factory.getVehicle(vehicleName).name);
    }
}
