package org.fanshoufeng.interfaces.i2_6;

public class ClassD implements InterfaceB, InterfaceC {

	@Override
	public void hello() {
		InterfaceB.super.hello();
	}

	public static void main(String[] args) {
		new ClassD().hello();
	}

}
