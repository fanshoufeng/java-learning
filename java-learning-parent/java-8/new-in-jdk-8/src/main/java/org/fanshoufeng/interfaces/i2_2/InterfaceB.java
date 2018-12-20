package org.fanshoufeng.interfaces.i2_2;

public interface InterfaceB extends InterfaceA {

	default void hello() {
		System.out.println("Hello from InterfaceB");
	}
	
}
