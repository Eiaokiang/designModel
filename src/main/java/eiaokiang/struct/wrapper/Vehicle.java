package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:24 2023/4/4
 */
public class Vehicle {

    public void runWith5V(Output5v battery5v){
        System.out.println("驱动电压：" + battery5v.output5v());
    }
}
