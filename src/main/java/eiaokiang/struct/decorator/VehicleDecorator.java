package eiaokiang.struct.decorator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:21 2023/4/6
 */

/**
 * 装饰抽象类
 */
public abstract class VehicleDecorator implements IVehicle {

    IVehicle vehicle;

    public VehicleDecorator(IVehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void createVehicle(){
        vehicle.createVehicle();
    }
}

/**
 * 贴纸装饰类
 */
class PasterDecorator extends VehicleDecorator{

    public PasterDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void createVehicle() {
        super.createVehicle();
        System.out.println("   贴一层帅气的贴纸");

    }
}


/**
 * 护栏装饰类
 */
class GuardrailDecorator extends VehicleDecorator{

    public GuardrailDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void createVehicle() {
        super.createVehicle();
        System.out.println("  增加安全护栏");

    }
}


