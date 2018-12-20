package org.fanshoufeng.interfaces.i1_2;

public class DefaultableImpl implements Defaulable {

	@Override
	public String required() {
		return "DefaultableImpl implementation required";
	}

	@Override
	public String notRequired() {
		return "DefaultableImpl implementation notRequired";
	}
	
}
