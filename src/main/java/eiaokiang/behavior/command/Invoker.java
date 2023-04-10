package eiaokiang.behavior.command;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:05 2023/4/10
 */

/**
 * 命令发起者
 */

class BossInvoker {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(){
        for (Command command : commands) {
            command.execute();
        }
    }

}
