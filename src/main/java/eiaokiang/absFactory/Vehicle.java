package eiaokiang.absFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:41 2023/4/3
 */
public abstract class Vehicle {
    protected String name;

    public abstract void speical();

    public void run(){
        System.out.println("跑动");
    }

}


