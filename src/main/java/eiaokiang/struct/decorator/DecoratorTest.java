package eiaokiang.struct.decorator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:30 2023/4/6
 */

/**
 * 装饰者模式（IO模型 FilterInputStream）
 * 对一个原始对象扩展功能，不必改变原来
 * 动态的增加一个类的功能，增加过程中各个功能可以随意混搭和调换顺序
 */
public class DecoratorTest {

    public static void main(String[] args) {
        //原厂车型
        OriginVehicle originVehicle = new OriginVehicle();

        //加装护栏
        GuardrailDecorator guardrailDecorator = new GuardrailDecorator(originVehicle);


        //装饰贴纸
        PasterDecorator pasterDecorator = new PasterDecorator(guardrailDecorator);
        pasterDecorator.createVehicle();


    }


}
