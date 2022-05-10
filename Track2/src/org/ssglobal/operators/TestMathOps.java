package org.ssglobal.operators;

public class TestMathOps {

		public static void main (String args[]) {
			MathOps mo = new MathOps();
			System.out.println(mo.divide(10, 3));
			System.out.println(mo.calRemainder(10, 3));
			System.out.println(mo.divideNumCast(10, 3));
			System.out.println(mo.divideNumParams(10, 3));
			System.out.println(mo.divideNumCustom(10, 3));
			System.out.println(mo.divideNumReturnDouble(10, 3));
		}
}
