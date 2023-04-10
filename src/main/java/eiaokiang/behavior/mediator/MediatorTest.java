package eiaokiang.behavior.mediator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:33 2023/4/10
 */

/**
 * 中介者模式
 * 系统中对象之间存在复杂的引用关系，系统结构混乱且难以理解。
 * 适用于一个对象由于引用了其他很多对象并且直接和这些对象通信，导致难以复用该对象。
 * 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。可以通过引入中介者类来实现，在中介者中定义对象交互的公共行为，如果需要改变行为则可以增加新的具体中介者类。
 */
public class MediatorTest {
    public static void main(String[] args) {
        HouseMediator houseMediator = new HouseMediator();

        HouseHolder houseHolder = new HouseHolder("45区房主",houseMediator);
        Tz tz = new Tz("兔子", houseMediator);
        Xp xp = new Xp("小胖", houseMediator);

        houseMediator.setHouseHolder(houseHolder);
        houseMediator.setTz(tz);
        houseMediator.setXp(xp);

        tz.constact("哪有房");
        xp.constact("哪有店铺");

        houseHolder.constact("有店铺和房屋出租");
    }
}
