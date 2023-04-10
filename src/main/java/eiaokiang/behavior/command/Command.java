package eiaokiang.behavior.command;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:46 2023/4/10
 */

/**
 * 抽象命令类
 */
public interface Command {

    void execute();

    void undo();
}


/**
 * 具体命令类
 */
class OrderCommand implements Command{

    FrontDesk frontDesk;

    public OrderCommand(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    @Override
    public void execute() {
        frontDesk.makeOrder();
    }

    @Override
    public void undo() {
        frontDesk.undoMakeOrder();
    }
}

class AssembleCommand implements Command{

    Worker worker;

    public AssembleCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        worker.assembleVehicle();
    }

    @Override
    public void undo() {
        worker.undoAssembleVehicle();
    }
}