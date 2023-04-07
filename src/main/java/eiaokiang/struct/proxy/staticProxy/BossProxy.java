package eiaokiang.struct.proxy.staticProxy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:19 2023/4/7
 */
public class BossProxy implements IDailyDecide {

    IDailyDecide dailyDecide;

    public BossProxy(IDailyDecide dailyDecide) {
        this.dailyDecide = dailyDecide;
    }

    @Override
    public void dailyDecide() {
        System.out.println("代理技能：积极协商");
        dailyDecide.dailyDecide();
    }
}
