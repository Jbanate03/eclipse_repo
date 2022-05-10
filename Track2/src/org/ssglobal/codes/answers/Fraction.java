package org.ssglobal.codes.answers;

import org.ssglobal.codes.arrays.SampleArrays;
import org.ssglobal.operators.McdonaldFood;

public class Fraction {
	
	public SampleArrays sample = new SampleArrays(); // null is an object
	public McdonaldFood mcdo = new McdonaldFood();
	
	public static long id = 90L;
	
	public int numerator;
	public int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void toFractionString() {
		OverFlow over = new OverFlow();
		System.out.println(numerator + "/" + denominator );
	}
	
	public Fraction add(Fraction summad) {
		numerator = numerator * summad.denominator + summad.numerator * denominator;
		denominator = denominator * summad.denominator;

		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public Fraction multiply(Fraction factor) {
		numerator = numerator * factor.numerator;
		denominator = denominator * factor.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public boolean greaterEqual(Fraction fraction) {
		
		int numer1 = numerator * fraction.denominator;
		int numer2 = fraction.numerator * denominator;
		// denominator assumed same for both
		
		if (numer1 >= numer2) {
			return true;
		}else {
			return false;
		}
	}
}
