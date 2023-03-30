package com.sym.builder.improve;

public class HighBuilding implements HouseBuilder{
    @Override
    public void buildBasic() {
        hose.setBase("100米");
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        hose.setWall("100cm");
        System.out.println("高楼砌墙100cm");
    }

    @Override
    public void roofed() {
        hose.setRoofed("结工了");
        System.out.println("高楼封顶");
    }
    
}
