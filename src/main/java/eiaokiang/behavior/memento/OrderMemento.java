package eiaokiang.behavior.memento;

import java.util.Date;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:26 2023/4/10
 */

/**
 * 订单备忘pojo
 */
public class OrderMemento {

    private int orderNum;
    private Date date;

    public int getOrderNum() {
        return orderNum;
    }

    public Date getDate() {
        return date;
    }

    public OrderMemento(int orderNum, Date date) {
        this.orderNum = orderNum;
        this.date = date;
    }
}
