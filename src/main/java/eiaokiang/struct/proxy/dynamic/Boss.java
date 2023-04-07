package eiaokiang.struct.proxy.dynamic;



/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:18 2023/4/7
 */
public class Boss implements ISaleDecide {
    @Override
    public void dailyDecide() {
        System.out.println("做出日常决定");
    }
}
