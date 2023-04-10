package eiaokiang.behavior.mediator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:42 2023/4/10
 */

/**
 * 抽象中介类
 */
public interface Mediator {

    void constact(String msg,Person person);

}


/**
 * 具体中介类
 */
class HouseMediator implements Mediator {

    private HouseHolder houseHolder;

    private Xp xp;

    private Tz tz;

    public void setHouseHolder(HouseHolder houseHolder) {
        this.houseHolder = houseHolder;
    }

    public void setXp(Xp xp) {
        this.xp = xp;
    }

    public void setTz(Tz tz) {
        this.tz = tz;
    }

    @Override
    public void constact(String msg,Person person) {
        if (person == houseHolder){
            xp.getMessage(msg);
            tz.getMessage(msg);
        }else if (person == xp || person == tz){
            houseHolder.getMessage(msg);
        }
    }
}

