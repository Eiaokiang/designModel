package eiaokiang.behavior.strategy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:02 2023/4/11
 */

/**
 *  躲避工商检查
 */
public interface PassStrategy {

    void pass();
}


class NormalPass implements  PassStrategy{
    @Override
    public void pass() {
        System.out.println("拆除座包车辆，通过检查");
    }
}


class MoneyPass implements  PassStrategy{
    @Override
    public void pass() {
        System.out.println("小小打点一下，通过检查");
    }
}

class HidePass implements  PassStrategy{
    @Override
    public void pass() {
        System.out.println("隐藏座包车辆，通过检查");
    }
}
