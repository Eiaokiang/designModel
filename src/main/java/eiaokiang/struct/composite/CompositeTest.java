package eiaokiang.struct.composite;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:03 2023/4/6
 */

/**
 * 组合模式（统一操作，层级/树形管理）(未理解)
 */
public class CompositeTest {

    public static void main(String[] args) {
        FirstLevelShop ls1 = new FirstLevelShop("1级代理-ls");
        SecondLevelShop xp2 = new SecondLevelShop("2级代理-xp");
        SecondLevelShop cq2 = new SecondLevelShop("2级代理-cq");
        ThirdLevelShop yq3 = new ThirdLevelShop("3级代理-yq");
        xp2.addLowShop(yq3);
        ls1.addLowShop(xp2);
        ls1.addLowShop(cq2);

        System.out.println(ls1.getChild("2级代理-xp").getName());


    }


}
