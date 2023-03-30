package com.sym.builder.improve;

public class CommonBuilding implements HouseBuilder{
    @Override
    public void buildBasic() {
        hose.setBase("10米");
        System.out.println("普通房子打地基10米");
    }

    @Override
    public void buildWalls() {
        hose.setWall("5cm");
        System.out.println("普通房子砌墙5cm");
    }

    @Override
    public void roofed() {
        hose.setRoofed("结工了");
        System.out.println("普通房子封顶");
    }

}
