package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:16 2023/4/4
 */

/**
 * 类适配器（单继承）
 */
public class Battery70vTo5vClassAdapter extends Battery70v implements Output5v{

    public int output5v() {
        int v70 = output70v();
        return v70 / 14;
    }
}
