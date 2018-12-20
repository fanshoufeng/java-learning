package org.fanshoufeng.interfaces.i1_3;

public interface Defaulable {

	String required();
	
	default String notRequired() {
		return "Default implementation notRequired";
	}
	
}
