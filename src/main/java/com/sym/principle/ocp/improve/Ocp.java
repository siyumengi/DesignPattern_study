package com.sym.principle.ocp.improve;

/**
 *思路:把创建Shape类做成抽象类，并提供一个抽象的draw方法，
 * 让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可，使用方的代码就不需要修→>满足了开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Rectangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //    接收 Shape 对象，调用 draw 方法
    public void drawShape(Shape s) {
        s.draw();
    }

}

abstract class Shape {
    int myType;

    public abstract void draw();
}

// 矩形
class Rectangle extends Shape {
    Rectangle() {
        super.myType = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制了矩形");
    }
}

// 圆形
class Circle extends Shape {
    Circle() {
        super.myType = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制了圆形");
    }
}

// 三角形
class Triangle extends Shape {
    Triangle() {
        super.myType = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制了三角形");
    }
}