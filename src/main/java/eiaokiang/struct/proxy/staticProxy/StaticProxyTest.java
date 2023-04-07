package eiaokiang.struct.proxy.staticProxy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:17 2023/4/7
 */

/**
 * 静态代理(在编译期就确定了代理对象yq，通过implement)
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        IDailyDecide proxy = StaticProxyFactory.getProxy();
        proxy.dailyDecide();
    }
}
