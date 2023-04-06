package eiaokiang.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 18:24 2023/4/6
 */
public class TestVehicleFactory {

    private static final Map<String,ITestVehicle> map = new HashMap<>();

    public static ITestVehicle getTestVehicle(String type){
        ITestVehicle testVehicle;
        if (map.get(type) == null){
            testVehicle = type == "Em3"? new Em3Vehicle():new Om2Vehicle();
            map.put("Em3",testVehicle);
        }else {
            testVehicle = map.get(type);
        }
        return testVehicle;
    }

}
