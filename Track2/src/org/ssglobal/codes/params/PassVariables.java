package org.ssglobal.codes.params;

public class PassVariables {

	public void passPrimitive(int number) {
		number = 100;
		System.out.format("the new number is %d \n", number);
	}
	
	public void passRefVar(StringBuilder sb) { // pointer-like si sb
		sb.append("in the Philippines");
		System.out.format("the new sb is %s \n", sb.toString());
	}
	
	public void passStrVal(String str) {
		str = "Pasig";
		System.out.format("the new str is %s \n", str);
	}
	
}
