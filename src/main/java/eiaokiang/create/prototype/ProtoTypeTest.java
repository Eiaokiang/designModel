package eiaokiang.create.prototype;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:43 2023/4/4
 */

import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;

/**
 * 原型模式
 * 适用于高效动态复制对象
 * Spring中 bean用到的多例模式
 *
 * 深拷贝：完全复制属性修改
 * 浅拷贝：只是修改引用指向
 *
 * 深拷贝实现：
 * 1.重写clone方法，遍历类中的引用类型调用clone方法（但如果有新增成员变量都要修改）
 * 2.使用流进行序列化和反序列化复制，可以引用 Apache Common包
 */
public class ProtoTypeTest implements Cloneable  {
    private  String name;

    ProtoTypeTest friend;

    //开分店，需要不同的货源
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Veichcle> veichcles = new ArrayList<Veichcle>();
        VeichcleShop xpShop = new VeichcleShop();
        xpShop.setVeichcles(veichcles);
        VeichcleShop tzShop = (VeichcleShop) xpShop.clone();

        //用clone方法是浅拷贝，所以拷贝后的成员变量如果为引用类型并没有新创建，而只是修改了引用，引用相同
        System.out.println(tzShop.getVeichcles().hashCode());
        System.out.println(xpShop.getVeichcles().hashCode());
        System.out.println(xpShop.getVeichcles() == tzShop.getVeichcles());


        //深拷贝,引用不同
        VeichcleShop tzShop2 = SerializationUtils.clone(xpShop);
        System.out.println(tzShop2.getVeichcles() == xpShop.getVeichcles());

    }




    public ProtoTypeTest getFriend() {
        return friend;
    }

    public void setFriend(ProtoTypeTest friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
