package eiaokiang.behavior.responsibility;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:26 2023/4/11
 */

/**
 * 开店合同审批处理
 */
public interface ContractHandler {

    void setHandler(ContractHandler handler);

    boolean handle(int level);
}


class FirstLevel implements ContractHandler{

    private ContractHandler nextHandler;

    @Override
    public void setHandler(ContractHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean handle(int level) {
        if (level == 2){
            System.out.println("一级可批准二级开业");
            return true;
        }
        return nextHandler.handle(level);
    }
}


class Manager implements ContractHandler{

    private ContractHandler nextHandler;

    @Override
    public void setHandler(ContractHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean handle(int level) {
        if (level == 1){
            System.out.println("经理可批准一级开业");
            return true;
        }

        return false;
    }
}
