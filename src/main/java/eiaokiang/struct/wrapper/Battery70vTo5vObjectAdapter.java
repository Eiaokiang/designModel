package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:16 2023/4/4
 */

/**
 * 类适配器（单继承）
 */
public class Battery70vTo5vObjectAdapter implements Output5v{

    private Battery70v battery70v;

    public Battery70vTo5vObjectAdapter(Battery70v battery70v) {
        this.battery70v = battery70v;
    }

    public int output5v() {
        int v70 = battery70v.output70v();
        return v70 / 14;
    }
}
