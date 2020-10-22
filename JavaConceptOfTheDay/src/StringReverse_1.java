import java.util.Scanner;

public class StringReverse_1 {
	static String str2 = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
//1. Using String Buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

//2. Using iterative method	
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);

		}
		System.out.println();

//3. best Way
		for (int i = 0, j = strArray.length - 1; i < strArray.length / 2; i++, j--) {
			char temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = temp;
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

//4. Using Recursive method   
		System.out.println();
		String reverseString = recursiveMethod(str);
		System.out.println(reverseString);
		String reverseString2 = recursiveMethod2(str);
		System.out.println(reverseString2);
	}

	private static String recursiveMethod2(String str) {
		if (str.length() > 0) {
			str2 = str2 + str.charAt(str.length() - 1);
			str = str.substring(0, str.length() - 1);
			recursiveMethod2(str);
		}
		return str2;
	}

	private static String recursiveMethod(String str) {
		if (null == str || str.length() <= 1) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
