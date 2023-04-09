package com.sym.command;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用命令模式");
        RemoteController remoteController = new RemoteController();
//        电灯的运用
        LightReceiver lightReceiver = new LightReceiver();
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        int lightSum = 0;
        remoteController.setOnCommand(lightSum , lightOnCommand , lightOffCommand);
        remoteController.onButtonWasPushed(lightSum);
        remoteController.offButtonWasPushed(lightSum);
        remoteController.undoButtonWasPushed();
//        电视的运用
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        int TVSum = 1;
        remoteController.setOnCommand(TVSum , tvOnCommand , tvOffCommand);
        remoteController.onButtonWasPushed(TVSum);
        remoteController.offButtonWasPushed(TVSum);
        remoteController.undoButtonWasPushed();


    }
}
