package eiaokiang.behavior.responsibility;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:14 2023/4/11
 */

/**
 * 责任链模式
 * 每个处理器互相首尾连接在一起成为一条链，然后任务顺着这条链往下传，直到被某个处理器处理掉
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
 *
 * 注意小心链变成环
 */
public class ResponsibilityTest {

    public static void main(String[] args) {
        ContractHandler manager = new Manager();
        FirstLevel fistLevel = new FirstLevel();
        fistLevel.setHandler(manager);

        fistLevel.handle(1);
    }

}
