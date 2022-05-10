
package org.ssglobal.operators;

public class Temperature {
	
		public float chooseTemprature(int option) {
			float temparature = 0.0F;
			
			if (option == 0) {
				temparature = 50.0F;
			}else if (option == 1) {
				temparature = 60.0F;
			}else if (option == 2) {
				temparature = 70.0F;
			}else if (option == 3) {
				temparature = 80.0F;
			}
			return temparature;	
		}
		
		public float chooseTemparatureSwitch(int option) {
			float temparature = 0.0F;
			
			switch(option) {
				case 0:
					temparature = 50.0F;
					break;
				case 1:
					temparature = 60.0F;
					break;
				case 2:
					temparature = 70.0F;
					break;
				case 3:
					temparature = 80.0F;
					break;
			}
			
			return temparature;
		}
		
		public String chooseColor(int option) {
			String color = "";
			
			switch(option) {
				case 0:
				case 1:
				case 2:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:	
					color = "RED";
					break;
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					color = "BLUE";
					break;
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
					color = "GREEN";
					break;
				default:
					color = "COLORLESS";
					break;
			}
			
			return color;
		}
		
}
