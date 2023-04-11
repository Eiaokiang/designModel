package eiaokiang.behavior.strategy;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 10:46 2023/4/11
 */

/**
 * 策略模式
 * 一个操作有好多种实现方法  完成一个共同目的  可选择时使用
 */
public class StrategyTest {

    public static void usePassStrategy(PassStrategy passStrategy){
        passStrategy.pass();
    }

    public static void main(String[] args) {
        System.out.println("工商来查");
        //没钱策略
        HidePass hidePass = new HidePass();
        usePassStrategy(hidePass);

        //有钱策略
        MoneyPass moneyPass = new MoneyPass();
        usePassStrategy(moneyPass);
    }

}
