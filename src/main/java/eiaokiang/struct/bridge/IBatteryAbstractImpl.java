package eiaokiang.struct.bridge;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:38 2023/4/6
 */

/**
 * 抽象电池实现
 */
public interface IBatteryAbstractImpl {


    public String outputV();

}


/**
 * 抽象具体实现
 */
class Battery48vImpl implements IBatteryAbstractImpl {
    public String outputV() {
        return "48V";
    }
}


/**
 * 抽象具体实现
 */
class Battery60vImpl implements IBatteryAbstractImpl {
    public String outputV() {
        return "60V";
    }
}


/**
 * 抽象具体实现
 */
class Battery72vImpl implements IBatteryAbstractImpl {
    public String outputV() {
        return "72V";
    }
}
