package eiaokiang.fFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:38 2023/4/3
 */

/**
 * 工厂方法
 * 适用于多个相同维度（如点电动车这个维度，但有很多种电动车，台铃电动车（下面又有具体种类），雅迪电动车）
 * 在拓展性上，只需新增电动车种类，和工厂种类，即使有多个shop使用也无需修改，直接拼接即可
 */
public class FFactoryTest {

    public static void main(String[] args) {
        AVehicleShop ashop = new AVehicleShop();
        ashop.sale("TaiLinEm",new TaiLinFactory());
        ashop.sale("TaiLinOm",new TaiLinFactory());
        ashop.sale("YaDiOm",new YaDiFactory());
        ashop.sale("YaDiEm",new YaDiFactory());


        AVehicleShop bshop = new AVehicleShop();
        bshop.sale("TaiLinEm",new TaiLinFactory());
        bshop.sale("TaiLinOm",new TaiLinFactory());
        bshop.sale("YaDiOm",new YaDiFactory());
        bshop.sale("YaDiEm",new YaDiFactory());

    }

}




