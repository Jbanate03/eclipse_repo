package org.ssglobal.declaration;
 


public class TestNumDiff {
	
	public static void main (String args[]) {
		String num = args[0];
		int numVal = Integer.parseInt(num);
		
		NumDiff diff = new NumDiff();
		int result = diff.calculateNumDiff(numVal);
		System.out.println(result);
	}
	
}
