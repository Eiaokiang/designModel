package eiaokiang.behavior.memento;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:25 2023/4/10
 */

import java.util.Calendar;
import java.util.Date;

/**
 * 备忘录模式
 *  1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。
 *  2、实现了信息的封装，使得用户不需要关心状态的保存细节。
 */
public class MementoTest {
    public static void main(String[] args) {
        Date date = new Date();
        //记账人
        OrderRecorder orderRecorder = new OrderRecorder();
        //记录操作对象
        CareTaker careTaker = new CareTaker();
        //第一天记账
        orderRecorder.setDate(date);
        orderRecorder.setOrderNum(8);
        OrderMemento orderMemento1 = orderRecorder.saveStateToMenmeto();
        //保存备忘录1
        careTaker.addMemento(orderMemento1);


        //第二天记账
        orderRecorder.setOrderNum(7);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DATE,1);
        orderRecorder.setDate(instance.getTime());
        orderRecorder.saveStateToMenmeto();
        OrderMemento orderMemento2 = orderRecorder.saveStateToMenmeto();
        //保存备忘录2
        careTaker.addMemento(orderMemento2);



        //获取第二天记录
        Date date1 = careTaker.get(1).getDate();
        int orderNum1 = careTaker.get(1).getOrderNum();
        System.out.println(date1);
        System.out.println(orderNum1);


    }
}
