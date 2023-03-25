package com.sym.principle.ocp;

/**
 * 优点是好理解，简单
 * 违反了 ocp 原则，对扩展开放(对提供方)，对修改关闭(对使用方)
 *
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
    //    接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.myType == 1) {
            drawRectangle();
        } else if (s.myType == 2) {
            drawCircle();
        } else if (s.myType == 3) {
            drawTriangle();
        }
    }

    //    绘制圆形
    public void drawRectangle() {
        System.out.println("绘制圆形");
    }

    //    绘制矩形
    public void drawCircle() {
        System.out.println("绘制矩形");
    }
//    绘制三角形
    public void drawTriangle(){
        System.out.println("绘制三角形");
    }
}

class Shape {
    int myType;
}

// 矩形
class Rectangle extends Shape {
    Rectangle() {
        super.myType = 1;
    }
}

// 圆形
class Circle extends Shape {
    Circle() {
        super.myType = 2;
    }
}

// 三角形
class Triangle extends Shape {
    Triangle() {
        super.myType = 3;
    }
}