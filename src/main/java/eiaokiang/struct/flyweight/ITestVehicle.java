package eiaokiang.struct.flyweight;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:54 2023/4/6
 */

/**
 * 供顾客试乘坐的车
 */
public interface ITestVehicle {

    /**
     * 通过传入参数解决复用时不同差异
     * @param key
     */
    public void run(String key);

}

/**
 * 组装好的Em3试驾车
 */
class Em3Vehicle implements ITestVehicle {

    private String type = "Em3";

    @Override
    public void run(String key) {
        System.out.println("正在使用"+key+"试驾"+type);
    }
}

/**
 * 组装好的Om2试驾车
 */
class Om2Vehicle implements ITestVehicle {

    private String type = "Om2";

    @Override
    public void run(String key) {
        System.out.println("正在使用"+key+"试驾"+type);
    }
}



