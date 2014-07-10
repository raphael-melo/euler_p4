package euler_p4;

import Util.Util;

public class LargestPalindromeProduct {

	public static Long largestMutilpleDigitPalindrome(int digits) {
		int lNumber = Util.largestDigitNumber(digits);
		
		int numberOfIterations = (int) (9 * (Math.pow(10, digits-1) ));
		
		Long largestPalindrome = 0L;
		
		for (int i = 0; i < numberOfIterations; i++){
			for (int j = 0; j <= i; j++){
				int n1 = lNumber - i;
				int n2 = lNumber - j;
				Long currentMulti = new Long(n1*n2);
				if(Util.isPalindrome(currentMulti)){
					if(currentMulti>largestPalindrome)
						largestPalindrome = currentMulti;
				}
			}
		}
		return largestPalindrome;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestMutilpleDigitPalindrome(3));
		
	}

}
