package org.ssglobal.declaration;

public class MyDataType {
	
	//Global Variables
	public static final double PIE = 3.141617; // constants can be class var
	public static long versionID = 1L;
	public static String creature = "vertebrate";
	public static int error_level = 0;
	
	public byte counter;
	public short numProducts;
	public int numCells;
	public long numTcells = 20000L;
	
	public float weight = 0.0F;
	public double billGatesMoney;
	
	public char letter;
	public String personName = "";
	
	public void createVars() {
		// local variables
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F;
		System.out.println(counter);
		System.out.println(age);
		System.out.println(personName);
		System.out.println(letter);
	}
	
	public void manageArguments(final float weight, final byte counter) {
		System.out.println(weight);
		
	}
	
	public void createBlockVarsThruIf(int option) {
		
		if (option == 0) {
			int err_val = 10; // block variable
			option = option + err_val;
			System.out.println(option);
		}else {
			int otherwise_val = -10; // block variable
			option = option + otherwise_val;
			System.out.println(option);
		}
	}
	
	public void createBlockVarsThruLoop(int[] ids) {
		
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
	}
	
	public void createBlockVarsThruSwitch(int option) {
		
		switch(option) {
		case 1:
			float amount = 1000.0F;
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println(-1);
			break;
			
		}
	}
	
	public void assignLiterals() {
		//Integral Types
		counter = 127; // within the range -128, 127
		numProducts = 32000;
		numCells = 787878787;
		numTcells = 7878787877878L; // caused problem: coercion
		
		// real number types
		billGatesMoney = 9999999999999999999.89; // default real type
		weight = 89.56F;
		
		// character literal types
		
		//ASCII
		letter = 'H';
		System.out.println(letter);
		
		//Numerical value - coercion applies to ASCII only
		letter = 0; // \0
		System.out.println(letter);
		letter = 68;
		System.out.println(letter);
		
		//UNICODE characters (UTF-8) - hexadecimal
		letter = '\u00F1';
		System.out.println(letter);
		
		//String literals
		personName = "Juan Luna\n";
		System.out.println(personName);
		
	}
	
	public void literalConversion() {
		
		numProducts = 10; // identity Conversion
		
		// widening conversion 
		int amount = 32000;
		double salary = 67800.5F;
		
		// narrowing conversions
		byte param = (byte) 128;
		System.out.println(param);
		
		float price = (float) 89.6;
		System.out.println(price);
	}
}
	

class TestMyDataType{
	
public static void main(String[] args) {
		MyDataType mdt = new MyDataType();
		System.out.println(MyDataType.PIE);
		
		MyDataType.error_level = -1;
		System.out.println(MyDataType.error_level);
		mdt.manageArguments(89.6F, (byte) 0);
		mdt.manageArguments(75.6F, (byte) 7);
		mdt.createBlockVarsThruLoop(new int[] {10, 20, 45, 89});
		System.out.println(mdt.billGatesMoney); // instance variable
		
		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();
	}
}


