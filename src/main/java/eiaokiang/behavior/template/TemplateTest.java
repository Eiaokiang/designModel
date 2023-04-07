package eiaokiang.behavior.template;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:47 2023/4/7
 */

/**
 * 模板方法（适合解决多个干差不多事情的类）
 */
public class TemplateTest {


    public static void main(String[] args) {
        DockingTemplate yaDiDocking = new YaDiDocking();
        yaDiDocking.docking();

        System.out.println();

        DockingTemplate taiLinDocking = new TaiLinDocking();
        taiLinDocking.docking();
    }
}
