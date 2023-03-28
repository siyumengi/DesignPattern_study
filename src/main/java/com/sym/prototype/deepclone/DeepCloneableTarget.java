package com.sym.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {


    private static final long serialVersionUID = 392520298105026305L;
    private String name;
    private String cloneClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public DeepCloneableTarget(String name, String cloneClass) {
        this.name = name;
        this.cloneClass = cloneClass;
    }


}
