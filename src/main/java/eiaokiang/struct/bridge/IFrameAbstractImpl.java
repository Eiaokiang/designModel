package eiaokiang.struct.bridge;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:47 2023/4/6
 */

/**
 * 抽象车架实现类
 */
public interface IFrameAbstractImpl {

    public String frameType();
}



/**
 * 具体车架实现类
 */
class LightFrameImpl implements IFrameAbstractImpl{

    @Override
    public String frameType() {
        return "轻车架";
    }
}


/**
 * 具体车架实现类
 */
class SteelFrameImpl implements IFrameAbstractImpl{

    @Override
    public String frameType() {
        return "钢车架";
    }
}


/**
 * 具体车架实现类
 */
class BigFrameImpl implements IFrameAbstractImpl{

    @Override
    public String frameType() {
        return "大车架";
    }
}

