package org.ssglobal.operators;

public class CardManagement {
	
	//PRE TEST
	public void pickCards() {
		
		final int MAX_CARDS = 5;
		int counter = 0;
		
		while (counter < MAX_CARDS) {
			int cardNum = (int) (Math.random() * 52) + 1;
			System.out.println(cardNum);
			counter++;
		}
		
		
	}
}
