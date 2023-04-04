package eiaokiang.create.builder;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:43 2023/4/4
 */

/**
 * 建造者模式
 * 使用场景：当产品常用于选配组装时，且遵循一定的顺序性建造，且产品之间差距不大
 * 优势：将产品和创建过程解耦
 */
public class BuilderTest {

    public static void main(String[] args) {
        //链式创建
        VehicleChainBuild build = new VehicleChainBuild.VehicleBuilder("Yadi", "MD2").build();
        System.out.println(build.toString());
    }

}
