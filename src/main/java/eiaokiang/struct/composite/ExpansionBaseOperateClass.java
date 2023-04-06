package eiaokiang.struct.composite;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:16 2023/4/6
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 扩张店  通用统一操作类（用于规范下面的操作）
 */
public abstract class ExpansionBaseOperateClass {


    private String name;

    public ExpansionBaseOperateClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 发展下级店铺
     */
    public abstract void addLowShop(ExpansionBaseOperateClass e);

    /**
     * 获取当前下级店铺
     */
    public abstract ExpansionBaseOperateClass getChild(String name);

}


/**
 * 1级组合类
 */
class FirstLevelShop extends ExpansionBaseOperateClass {

    public FirstLevelShop(String name){
        super(name);
    }

    private List<ExpansionBaseOperateClass> composites = new ArrayList<>();


    @Override
    public void addLowShop(ExpansionBaseOperateClass base) {
        composites.add(base);
    }

    @Override
    public ExpansionBaseOperateClass getChild(String name) {
        for (ExpansionBaseOperateClass composite : composites) {
            if (composite.getChild(name) != null){
                return composite;
            }
        }

        return null;
    }
}


/**
 * 2级组合类
 */
class SecondLevelShop extends ExpansionBaseOperateClass {

    public SecondLevelShop(String name) {
        super(name);
    }

    private List<ExpansionBaseOperateClass> composites = new ArrayList<>();


    @Override
    public void addLowShop(ExpansionBaseOperateClass base) {
        composites.add(base);
    }

    @Override
    public ExpansionBaseOperateClass getChild(String name) {
        for (ExpansionBaseOperateClass composite : composites) {
            if (composite.getChild(name) != null){
                return composite;
            }
        }

        return null;
    }
}



/**
 * 3级叶子节点
 */
class ThirdLevelShop extends ExpansionBaseOperateClass {

    public ThirdLevelShop(String name) {
        super(name);
    }

    private List<ExpansionBaseOperateClass> composites = new ArrayList<>();


    @Override
    public void addLowShop(ExpansionBaseOperateClass base) {
        throw new UnsupportedOperationException(this.getName()+"已经是最基本部门，无法增加下属部门");
    }

    @Override
    public ExpansionBaseOperateClass getChild(String name) {
        if(getName().equals(name)){
            return this;
        }
        return null;
    }
}



