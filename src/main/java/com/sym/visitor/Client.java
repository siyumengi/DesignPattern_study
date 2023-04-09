package com.sym.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new WoMan());
        structure.attach(new Man());

        Success success = new Success();
        structure.display(success);
        Fail fail = new Fail();
        structure.display(fail);
        Wait wait = new Wait();
        structure.display(wait);
    }
}
