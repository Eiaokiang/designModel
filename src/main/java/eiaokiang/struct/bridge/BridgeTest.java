package eiaokiang.struct.bridge;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:32 2023/4/6
 */

/**
 * 桥接模式
 * 对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 * 如本例子，不希望创建72v大车架雅迪车，72v轻车架雅迪车，60v大车架雅迪车，60v轻车架雅迪车...
 * （JDBC）强调了具体实现可以独立变化
 *
 * 通过在抽象类中引入抽象接口来实现面向接口编程，实现依赖倒置原则
 * 区别于创建型设计模式专注于创建，结构型都是在对已创建的结构上做有效组合
 */
public class BridgeTest {

    public static void main(String[] args) {

        /**
         * 只需通过传入即可组合出想要的具体实现类，而无需创建出多个类
         */
        VehicleAbstraction yaDiVehicle1 = new YaDiVehicle(new Battery72vImpl(), new BigFrameImpl());
        yaDiVehicle1.outputConfig();


        VehicleAbstraction yaDiVehicle2 = new YaDiVehicle(new Battery60vImpl(), new BigFrameImpl());
        yaDiVehicle2.outputConfig();


    }

}
