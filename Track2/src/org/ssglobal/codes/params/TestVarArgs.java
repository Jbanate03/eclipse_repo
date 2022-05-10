package org.ssglobal.codes.params;

public class TestVarArgs {

	public static void main(String... args) {
		
		// variable argument list
		VarArg var = new VarArg();
		var.printNums(1, 2, 3);
		var.printNums();
		var.printNums(10, 11, 12, 13, 14, 15);
		
		// NULL keyword is a garbage collector

	}

}
