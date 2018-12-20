package org.fanshoufeng.interfaces.i2_6;

public interface InterfaceC extends InterfaceA {

	default void hello() {
		System.out.println("Hello from InterfaceC");
	}
	
}
