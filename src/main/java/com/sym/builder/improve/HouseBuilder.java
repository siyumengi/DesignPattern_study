package com.sym.builder.improve;

public interface HouseBuilder {
    House hose = new House();
    //        打地基
     void buildBasic();
    //    砌墙
    void buildWalls();
    //    封顶
     void roofed();

//     建造房子，将房子返回
      default House buildHouse(){
        return hose;
    }
}


