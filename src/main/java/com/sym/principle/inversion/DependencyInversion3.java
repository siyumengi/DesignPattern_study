package com.sym.principle.inversion;

public class DependencyInversion3 {
    public static void main(String[] args) {
//        方式1实现
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);
//        方式2实现
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
//        方式3实现
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}
//方式1：通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose{
//    public void open(ITV tv);
//}
//interface ITV{
//    public void play();
//}
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("方式1：长虹电视开启喽~");
//    }
//}
////实现接口
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//方式2：通过构造器方法依赖传递
//interface IOpenAndClose {
//    void open();
//}
//interface ITV{
//    void play();
//}
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("方式2：长虹电视开启喽~");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}

//方式3：通过 setter 方法传递
interface IOpenAndClose {
    void open();

    void setTv(ITV tv);
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("方式3：长虹电视开启喽~");
    }
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}