package org.fanshoufeng.interfaces.i1_3;

import java.util.function.Supplier;

public interface DefaulableFactory {

	static Defaulable create(Supplier<Defaulable> supplier) {
		return supplier.get();
	}
	
}
