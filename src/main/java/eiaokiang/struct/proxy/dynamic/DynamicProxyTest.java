package eiaokiang.struct.proxy.dynamic;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:34 2023/4/7
 */

/**
 * 动态代理（在运行时才确定要代理的对象）
 * 要使用
 */
public class DynamicProxyTest {


    public static void main(String[] args) {
         ISaleDecide proxy = (ISaleDecide) DynamicProxyFactory.getDynProxy(new Boss());
         proxy.dailyDecide();
    }


}
