package eiaokiang.struct.decorator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:20 2023/4/6
 */

/**
 * 原始被装饰类
 */
public class OriginVehicle implements IVehicle{

    public void createVehicle() {
        System.out.println("创建原厂车型");
    }
}
