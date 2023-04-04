package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:16 2023/4/4
 */

/**
 * 接口适配器
 */
public abstract class Battery70vTo5vInterfaceAdapter implements Output5v {

    private Battery70v battery70v;

    public Battery70vTo5vInterfaceAdapter(Battery70v battery70v) {
        this.battery70v = battery70v;
    }

    public int output5v() {
        return 0;
    }
}
