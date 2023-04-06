package eiaokiang.struct.bridge;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:37 2023/4/6
 */

/**
 * 电动车抽象化角色
 */
public abstract class VehicleAbstraction {

    /**
     * 在抽象化角色中 引入抽象实现类
     */
    IBatteryAbstractImpl iBatteryAbstract;

    IFrameAbstractImpl iFrameAbstract;

    /**
     * 通过构造器传入
     * @param iBatteryAbstract
     * @param iFrameAbstract
     */
    public VehicleAbstraction(IBatteryAbstractImpl iBatteryAbstract,IFrameAbstractImpl iFrameAbstract){
        this.iBatteryAbstract = iBatteryAbstract;
        this.iFrameAbstract = iFrameAbstract;
    }

    public void outputConfig(){
        System.out.println("电池输出："+iBatteryAbstract.outputV()+"  车架类型："+iFrameAbstract.frameType());
    }

}


/**
 * 电动车定制扩展类
 */
class YaDiVehicle extends VehicleAbstraction{
    public YaDiVehicle(IBatteryAbstractImpl iBatteryAbstract, IFrameAbstractImpl iFrameAbstract) {
        super(iBatteryAbstract, iFrameAbstract);
    }


    public void useNFC(){
        System.out.println("定制化NFC功能");
    }


}


