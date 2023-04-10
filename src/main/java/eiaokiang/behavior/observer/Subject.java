package eiaokiang.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:01 2023/4/10
 */

public interface Subject{

    void add(Observer observer);
    void remove(Observer observer);
    void notifyState(String msg);

}

class VehiclePlatfrom implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        System.out.println(observer.getName()+" 加入平台抢购");
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        System.out.println(observer.getName()+" 离开平台抢购");
        observers.remove(observer);
    }

    @Override
    public void notifyState(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
