package eiaokiang.behavior.memento;

import java.util.Date;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:40 2023/4/10
 */
public class OrderRecorder {

    private int orderNum;
    private Date date;

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderMemento saveStateToMenmeto(){
        return new OrderMemento(orderNum,date);
    }

    public void  getStateFromMemeto(OrderMemento memento){
        orderNum = memento.getOrderNum();
        date = memento.getDate();
    }
}
