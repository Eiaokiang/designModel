package eiaokiang.create.prototype;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:57 2023/4/4
 */
public class VeichcleShop implements Cloneable,Serializable {

    private List<Veichcle> veichcles;

    public List<Veichcle> getVeichcles() {
        return veichcles;
    }

    public void setVeichcles(List<Veichcle> veichcles) {
        this.veichcles = veichcles;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
