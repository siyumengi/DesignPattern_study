package com.sym.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.close();

        UpRightPhone upRightPhone = new UpRightPhone(new Vivo());
        upRightPhone.open();
        upRightPhone.close();

    }
}
