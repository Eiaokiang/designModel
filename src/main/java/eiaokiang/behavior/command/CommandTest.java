package eiaokiang.behavior.command;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:22 2023/4/10
 */


/**
 * 命令模式
 * 用于对需要对某些对象发出操作请求，但不知道具体接受者是谁。 解耦发出和执行对象
 * 关键点：将请求封装为对象，命令可撤销
 * 角色：调用者，被调用者，命令（持有被调用者），
 */
public class CommandTest {

    public static void main(String[] args) {
        System.out.println("客户购入车辆");

        BossInvoker bossInvoker = new BossInvoker();

        OrderCommand orderCommand = new OrderCommand(new FrontDesk());

        AssembleCommand assembleCommand = new AssembleCommand(new Worker());

        bossInvoker.addCommand(orderCommand);
        bossInvoker.addCommand(assembleCommand);

        bossInvoker.executeCommand();
    }

}
