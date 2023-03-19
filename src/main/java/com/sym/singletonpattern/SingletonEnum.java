package com.sym.singletonpattern;

/**
 * 枚举类
 * 极度推荐
 * SingletonEnum.instance.method();
 */
public enum SingletonEnum {
	
	 instance; 
	 
	 private SingletonEnum() {}
	 
	 public void method(){
	 }
}