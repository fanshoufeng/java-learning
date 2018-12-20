package org.fanshoufeng.interfaces.i2_4;

public class ClassD implements InterfaceB, InterfaceC {

	@Override
	public void hello() {
		System.out.println("Hello from ClassD implement InterfaceC");
	}

	public static void main(String[] args) {
		new ClassD().hello();
	}

}
