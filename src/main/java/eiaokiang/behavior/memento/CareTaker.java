package eiaokiang.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:36 2023/4/10
 */
public class CareTaker {

    List<OrderMemento> mementoList = new ArrayList<>();

    public void addMemento(OrderMemento memento){
        mementoList.add(memento);
    }

    public OrderMemento get(int index){
        return mementoList.get(index);
    }


}
