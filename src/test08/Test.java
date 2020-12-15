package test08;

public class Test {

	public static void main(String[] args) {
		String[] strs = {"1","2","3"};
		int[] nums = new int[strs.length];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		
	}
}
