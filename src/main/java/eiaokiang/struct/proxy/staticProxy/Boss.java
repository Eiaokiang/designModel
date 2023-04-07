package eiaokiang.struct.proxy.staticProxy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:18 2023/4/7
 */
public class Boss implements IDailyDecide {
    @Override
    public void dailyDecide() {
        System.out.println("做出日常决定");
    }
}
