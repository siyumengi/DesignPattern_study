package com.sym.template.improve;

public abstract class SoyaMilk {
    void make() {
        select();
        if (customerWantCondiments()) {
            add();

        }
        soak();
        beat();
    }

    void select() {
        System.out.println("选择尚好黄豆");
    }

    abstract void add();

    void soak() {
        System.out.println("浸泡黄豆");
    }

    void beat() {
        System.out.println("打磨黄豆");
    }

    boolean customerWantCondiments() {
        return true;
    }
}
