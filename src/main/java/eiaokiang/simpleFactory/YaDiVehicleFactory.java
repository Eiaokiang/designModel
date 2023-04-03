package eiaokiang.simpleFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:47 2023/4/3
 */
class YaDiVehicleFactory {

    //使用工厂方法，只需要创建多一个电动车类，并在此修改即可，电动车店不需要修改售卖方法

    public static YaDiVehicle getVehicle(String name){
        if (name == "YaDiOm"){
            return new YaDiOm();
        }else if(name == "YaDiEm"){
            return new YaDiEm();
        }

        return null;
    }

}
