package org.ssglobal.codes.answers;

public class OverFlow {

	public static boolean sumOverFlow(byte x, byte y) {
		
		int sum = x + y;
		boolean result = (sum < -128 && sum > 127) ? true : false;
		return result;
	}
}
