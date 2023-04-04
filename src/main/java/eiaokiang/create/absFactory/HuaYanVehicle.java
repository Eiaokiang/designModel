package eiaokiang.create.absFactory;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 17:35 2023/4/3
 */

class ShangHaiHuaYan extends Vehicle{
    public ShangHaiHuaYan() {
        name = "ShangHaiHuaYan";
    }

    @Override
    public void speical() {
        System.out.println("亮灯");
    }
}