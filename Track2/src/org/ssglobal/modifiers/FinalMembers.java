package org.ssglobal.modifiers;

public class FinalMembers {
		
		// ERROR IF CONSTANT IS NOT INITIALIZE
		public final double PIE = 3.141617;
		public final StringBuilder FLOWER = new StringBuilder("Santan");
		
		public final void accessWithoutOverride() {
			
		}
		
		public void accessPoint() {
			FLOWER.append(" in Baguio");
			System.out.println(FLOWER);
			
		}
}
