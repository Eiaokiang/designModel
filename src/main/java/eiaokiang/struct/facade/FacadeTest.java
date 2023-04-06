package eiaokiang.struct.facade;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:46 2023/4/6
 */

/**
 * 外观模式（将分散的功能聚合成统一对外接口）
 * 多封装一层
 */
public class FacadeTest {


    public static void main(String[] args) {
        //通过统一接口调用
        UserBuy userBuy = new UserBuy();
        userBuy.userBuy();
        //也可以分别调用
        Ticket ticket = new Ticket();
        ticket.getTicket();
    }


}
