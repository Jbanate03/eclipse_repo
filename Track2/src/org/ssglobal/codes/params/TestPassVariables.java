package org.ssglobal.codes.params;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		// = is pointed to at / is assigned
		
		// Primitive Var
		// Safe when computing in method
		int testX = 10;
		System.out.format("this is the original number: %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("this is the new number: %d. \n", testX);
		
		// [0000555FAAB]testsb -> [123456644ABCD] --> 123445634ABCD("Manila")
		// Refrence Var
		StringBuilder testsb = new StringBuilder("Manila ");
		System.out.format("this is the original sb is %s. \n", testsb);
		cv.passRefVar(testsb);
		System.out.format("this is the new sb: %s. \n", testsb);
		
		// Using reference variable STRING
		String testStr = new String("Manila ");
		System.out.format("this is the new testStr is %s. \n", testStr);
		cv.passStrVal(testStr); // no passing of address
		System.out.format("this is the original str is %s. \n", testStr);

	}

}
