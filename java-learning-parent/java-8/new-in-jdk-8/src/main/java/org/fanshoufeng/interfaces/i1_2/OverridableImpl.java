package org.fanshoufeng.interfaces.i1_2;

public class OverridableImpl implements Defaulable {

	@Override
	public String required() {
		return "OverridableImpl implementation required";
	}

	@Override
	public String notRequired() {
		return "OverridableImpl implementation notRequired";
	}

}
