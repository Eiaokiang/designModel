package eiaokiang.behavior.mediator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:50 2023/4/10
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }



}


class Xp extends Person{
    public Xp(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息：" + message);
    }

}

class HouseHolder extends Person{
    public HouseHolder(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息：" + message);
    }

}


class Tz extends Person{
    public Tz(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息：" + message);
    }
}