package eiaokiang.behavior.iterator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:26 2023/4/10
 */

import java.util.Iterator;

/**
 * 迭代器模式
 * 迭代器模式让我们能游走于聚合内的每一个元素，而又不暴露其内部的实现细节
 * 把游走的任务放在迭代器上，而不是聚合上。这样简化了聚合的接口和实现，也让责任各得其所
 */
public class IteratorTest {

    public static void main(String[] args) {
        VehicleIterator vehicleIterator = new VehicleIterator();
        Iterator iterator = vehicleIterator.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
