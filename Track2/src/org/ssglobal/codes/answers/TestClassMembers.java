package org.ssglobal.codes.answers;

import org.ssglobal.modifiers.ClassMembers;

public class TestClassMembers extends ClassMembers {

	public static void main(String[] args) {
		
		ClassMembers cm = new ClassMembers();
		ClassMembers.id = 4L;
		cm.showData();
		
	}
	
	public void accessPoint() {
		key = 8080808;
		authenticate();
	}

}
