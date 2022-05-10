package org.ssglobal.codes.params;

public class VarArg {

	public void printNums(int... nums) {
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		
		//	for (int lookup: nums) {
		//		System.out.println(lookup);		
		//	}
		
		if (nums.length == 0) {
			System.out.println("Empty List");
		}else {
			for (int lookup: nums) {
				System.out.println(lookup);		
			}
		}
	}
	
	public void acceptComplexData(int x, int... y) {
		
	}
}
