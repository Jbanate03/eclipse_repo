package org.ssglobal.operators;

public class TestUnary {
	
	public static void main (String args[]) {
		Unary unary = new Unary();
		System.out.println("---------POST INCREMENT-----------");
		//unary.loopWithoutCounterVar();
		//unary.loopWithCounterVarPost();
		unary.loopWithoutCounterVarPre();
		System.out.println("------------------------------");
		unary.loopWithCounterVarPre();
		
		
	}
}
