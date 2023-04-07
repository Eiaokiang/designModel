package eiaokiang.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:22 2023/4/7
 */
public class DynamicProxyFactory {

    public static Object getDynProxy(Object target){
        InvocationHandler handler = new DynBossProxy(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }

}
