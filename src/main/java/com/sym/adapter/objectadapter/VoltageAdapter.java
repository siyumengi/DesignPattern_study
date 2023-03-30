package com.sym.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {
//    使用了聚合的方式
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (this.voltage220V != null) {
            int srcV = voltage220V.output220V();//获取电压
            System.out.println("使用对象适配器，进行适配");
            dstV = srcV / 44;
            System.out.println("适配完成，输出的电压为=" + dstV);
        }

        return dstV;
    }
}
