package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:12 2023/4/4
 */

/**
 * 适配器模式 （dispatcher）
 * 使用场景：为一个正常运转但功能不足的类做扩展
 * 比如以下70v就不要把电池改成5v了，而是使用适配器转换，保证了70v电池类不修改
 */
public class WrapperTest {

    public static void main(String[] args) {
        //类适配器
        Battery70vTo5vClassAdapter battery70vTo5vClassAdapter = new Battery70vTo5vClassAdapter();
        Vehicle vehicle = new Vehicle();
        vehicle.runWith5V(battery70vTo5vClassAdapter);

        //对象适配器
        final Battery70v battery70v = new Battery70v();
        Battery70vTo5vObjectAdapter battery70vTo5vObjectAdapter = new Battery70vTo5vObjectAdapter(battery70v);
        Vehicle vehicle2 = new Vehicle();
        vehicle2.runWith5V(battery70vTo5vObjectAdapter);


        //接口适配器  使用时可以选择性实现，必须重写使用
        Battery70vTo5vInterfaceAdapter battery70vTo5vInterfaceAdapter = new Battery70vTo5vInterfaceAdapter(new Battery70v()) {
            @Override
            public int output5v() {
                return battery70v.output70v() / 14;
            }
        };

        Vehicle vehicle3 = new Vehicle();
        vehicle3.runWith5V(battery70vTo5vInterfaceAdapter);

    }

}
