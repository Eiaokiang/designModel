package eiaokiang.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:14 2023/4/7
 */
public class DynBossProxy implements InvocationHandler {

    private Object boss;

    public DynBossProxy(Object boss) {
        this.boss = boss;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理功能：积极协商");
        Object result = method.invoke(boss,args);

        return result;
    }
}
