package eiaokiang.absFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:40 2023/4/3
 */

/**
 * 抽象工厂方法（将创建过程抽象，在创建工厂实例时确定工厂子类，从而确定将会产生什么产品）（动态工厂，不确定会使用哪个工厂子类，多维度进行组合）
 * 适用于多个维度创建（如维度1 电动车种类，维度2，地域）
 * 在拓展性上，只需新增电动车种类，和工厂种类，即使有多个shop使用也无需修改
 */
public class AbsFactoryTest {
    public static void main(String[] args) {
        AVehicleShop ashop = new AVehicleShop();
        ashop.sale("YaDiOm",new ShenZhenVehicleFactory());
        ashop.sale("YaDiEm",new BeiJingVehicleFactory());


        BVehicleShop bshop = new BVehicleShop();
        bshop.sale("TaiLinOm",new ShenZhenVehicleFactory());
        bshop.sale("TaiLinEm",new BeiJingVehicleFactory());

        CVehicleShop cVehicleShop = new CVehicleShop();
        cVehicleShop.sale("TaiLinOm",new ShenZhenVehicleFactory());
        cVehicleShop.sale("HuaYan",new ShanghaiVehicleFactory());
    }
}








