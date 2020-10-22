
public class ArmstrongNumber_7 {

	public static void main(String[] args) {
	        checkArmstrongNumber(153);
	 
	        checkArmstrongNumber(371);
	 
	        checkArmstrongNumber(9474);
	 
	        checkArmstrongNumber(54748);
	 
	        checkArmstrongNumber(407);
	 
	        checkArmstrongNumber(1674);
	    }
	
	private static void checkArmstrongNumber(int number) {
		int copyNumber = number;
		int numOfDigit = String.valueOf(number).length();
		int sum = 0;
		
		
		while(copyNumber > 0) {
			int lastDigit = copyNumber % 10;
			int singleDigitSum = 1;
			for (int i = 0; i < numOfDigit; i++) {
				singleDigitSum = singleDigitSum * lastDigit;
			}
			
			sum = sum + singleDigitSum;
			copyNumber = copyNumber / 10;
		}
		
		if ( number == sum ) {
			System.out.println( number + ": is an Armstrong Number");
		} else {
			System.out.println( number + ": is NOT an Armstrong Number");
		}
	}

}
