package org.ssglobal.modifiers;

public class TestClassMembers {

	public static void main(String[] args) {

		ClassMembers cm = new ClassMembers();
		cm.id = 3L;
		cm.showData();
		
		cm.salary = 6000.5;
		cm.printData();
		
		cm.key = 1231234;
		cm.authenticate();

	}
}
