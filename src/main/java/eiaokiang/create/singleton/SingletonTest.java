package eiaokiang.create.singleton;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 10:40 2023/4/3
 */

/**
 * 单例模式：确保了系统内存内只有一个对象
 * 场景：对于频繁需要创建且消耗巨大的对象
 */

public class SingletonTest {

    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);

        Singleton04 instance = Singleton04.INSTANCE;
        instance.sayOk();
    }

}

/**
 * 饿汉式（静态变量）
 * 优点：类加载的时候就创建，无线程问题
 * 缺点：如果没使用过就浪费内存
 */
class Singleton01 {

    private Singleton01(){}

    private static Singleton01 singleton = new Singleton01();

    public static Singleton01 getInstance(){
        return singleton;
    }
}


/**
 * 懒汉式 双重检查(推荐 兼顾效率和内存）
 */
class Singleton02 {

    private Singleton02(){}

    /**
     * volatile 防止指令重排
     * 重排前：分配内存空间 -》 初始化对象 -》 使变量指向对象
     * 重排后：分配内存空间 -》 使变量指向对象 -》 初始化对象
     * 没有volatile ，多线程中有可能指向对象后但还没初始化对象时退出同步代码块，导致后面线程以为已经创建成功调用为null
     */
    private static volatile Singleton02 singleton;

    public static Singleton02 getInstance(){
        if (singleton == null){
            synchronized (Singleton02.class){
                if (singleton == null){
                    singleton = new Singleton02();
                }
            }
        }
        return singleton;
    }
}

/**
 * 静态内部类单例（推荐，类加载阶段完成单例创建，且只会创建一次）
 */
class Singleton03{

    private Singleton03(){
    }

    private static class SingletonStaticClass{
        private static final Singleton03 SINGLETON_03 = new Singleton03();
    }


    public static Singleton03 getInstance(){
        return SingletonStaticClass.SINGLETON_03;
    }
}


/**
 * 枚举类单例
 */

enum Singleton04{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}





