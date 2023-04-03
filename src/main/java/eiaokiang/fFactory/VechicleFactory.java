package eiaokiang.fFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:45 2023/4/3
 */
public abstract class VechicleFactory {

    public abstract Vehicle getVechicle(String vechicleName);
}


class TaiLinFactory extends VechicleFactory{
    @Override
    public Vehicle getVechicle(String vechicleName) {
        Vehicle vehicle = null;
        if (vechicleName.equals("TaiLinOm")){
            vehicle = new TaiLinOm();
        }else if (vechicleName.equals("TaiLinEm")){
            vehicle = new TaiLinEm();
        }
        return vehicle;
    }
}

class YaDiFactory extends VechicleFactory{
    @Override
    public Vehicle getVechicle(String vechicleName) {
        Vehicle vehicle = null;
        if (vechicleName.equals("YaDiOm")){
            vehicle = new YaDiOm();
        }else if (vechicleName.equals("YaDiEm")){
            vehicle = new YaDiEm();
        }
        return vehicle;
    }
}