package org.ssglobal.modifiers;

public class ClassMembers {
	
	// static variables
	public static long id = 1L;
	double salary = 100.5;
	protected int key = 68638453;
	private char letter = 'V';
	
	
	// instance variable
	public int age = 10;
	
	// methods
	public void showData() {
		id = 2L;
		salary = 500.5;
		key = 454676557;
		letter = 'H';
	}
	
	void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	private void encryptData() {
		
	}
	
	public void reference() {
		showData();
		printData();
		authenticate();
		encryptData();
	}
	
}
