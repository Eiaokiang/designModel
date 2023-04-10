package eiaokiang.create.builder;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:43 2023/4/4
 */
public class Vehicle {

    @Override
    public String toString() {
        return "Vehicle{" +
                "battery='" + battery + '\'' +
                ", trunk='" + trunk + '\'' +
                ", wheel='" + wheel + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }

    //电池选装
    private String battery;

    //后备箱
    private String trunk;

    //轮子必装
    private String wheel;

    //车架必装
    private String frame;


    private Vehicle(VehicleBuilder builder){
        this.wheel = builder.wheel;
        this.frame = builder.frame;
        this.trunk = builder.trunk;
        this.battery = builder.battery;
    }

    public static class VehicleBuilder{


        //电池选装
        private String battery;

        //后备箱
        private String trunk;

        //轮子必装
        private String wheel;

        //车架必装
        private String frame;

        public VehicleBuilder(String frame,String wheel){
            this.frame = frame;
            this.wheel = wheel;
        }


        public VehicleBuilder setBattery(String battery) {
            this.battery = battery;
            return this;
        }


        public VehicleBuilder setTrunk(String trunk) {
            this.trunk = trunk;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }


}
