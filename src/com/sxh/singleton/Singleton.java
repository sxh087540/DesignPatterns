package com.sxh.singleton;

/*
 * 简单的单例模式(懒汉式)
 */
public class Singleton {
	private static Singleton singleton;
	private Singleton() {
		
	}
	
	public Singleton getIntance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
