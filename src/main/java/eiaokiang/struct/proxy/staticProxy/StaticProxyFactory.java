package eiaokiang.struct.proxy.staticProxy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:25 2023/4/7
 */
public class StaticProxyFactory {


    public static IDailyDecide getProxy(){
        return new BossProxy(new Boss());
    }

}
