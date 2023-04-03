package eiaokiang.simpleFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:40 2023/4/3
 */

/**
 * 简单工厂方法（静态工厂方法，因为创建过程是确定的）
 * 适用于单维度中具体的种类（如电动车这个维度中的雅迪电动车）
 * 在拓展性上，只需新增电动车种类，直接修改工厂类，即使有多个shop使用也无需修改
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        AVehicleShop aShop = new AVehicleShop();
        aShop.sale("YaDiOm");
        aShop.sale("YaDiEm");

        BVehicleShop bShop = new BVehicleShop();
        bShop.sale("YaDiOm");
        bShop.sale("YaDiEm");

    }
}



