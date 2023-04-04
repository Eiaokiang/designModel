package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:12 2023/4/4
 */

/**
 * 适配器模式
 * 使用场景：对一个正常运转但功能不足的类做扩展
 * 比如以下70v就不要把电池改成5v了，而是使用适配器转换，保证了70v电池类不修改
 */
public class WrapperTest {

    public static void main(String[] args) {
        Battery70vTo5vAdapter batteryAdapter = new Battery70vTo5vAdapter();
        Vehicle vehicle = new Vehicle();
        vehicle.runWith5V(batteryAdapter);
    }

}
