package eiaokiang.create.fFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:49 2023/4/3
 */
public abstract class Vehicle {

    protected String name;

    public abstract void speical();

    public void run(){
        System.out.println("跑动");
    }
}
