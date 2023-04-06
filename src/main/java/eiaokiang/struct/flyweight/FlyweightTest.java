package eiaokiang.struct.flyweight;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:50 2023/4/6
 */

/**
 * 享元模式（通过精细化功能的划分获得对一个可复用的对象，节省空间）
 *
 */
public class FlyweightTest {

    public static void main(String[] args) {

        //对于一个对象复用（EM3试用车），但又有动态的精细化分工（NFC或钥匙）
        ITestVehicle testVehicle1 = TestVehicleFactory.getTestVehicle("Em3");
        testVehicle1.run("NFC");
        ITestVehicle testVehicle2 = TestVehicleFactory.getTestVehicle("Em3");
        testVehicle2.run("钥匙");
        System.out.println(testVehicle1 == testVehicle2);
    }

}
