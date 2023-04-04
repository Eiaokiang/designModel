package eiaokiang.struct.wrapper;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:16 2023/4/4
 */
public class Battery70vTo5vAdapter extends Battery70v implements Output5v{


    public int output5v() {
        int v70 = output70v();
        return v70 / 14;
    }
}
