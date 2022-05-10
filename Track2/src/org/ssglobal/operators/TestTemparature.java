package org.ssglobal.operators;

public class TestTemparature {
	
	public static void main (String args[]) {
		Temperature temp = new Temperature();
		System.out.println(temp.chooseTemprature(0));
		System.out.println(temp.chooseTemparatureSwitch(0));
		System.out.println(temp.chooseColor(0));
	}
}
