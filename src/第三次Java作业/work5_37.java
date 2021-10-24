package 第三次Java作业;

import java.util.*;
public class work5_37 {
	public static void main(String[] args) {
		String binaryString = "";
		int decimalNumber;
		
		System.out.print("Enter a decimal integer: ");
		Scanner inputScanner = new Scanner(System.in);
		decimalNumber = inputScanner.nextInt();
		
		do {
			binaryString = decimalNumber % 2 + binaryString;
			decimalNumber /= 2;
		}while(decimalNumber > 0);

		System.out.printf("Its corresponding binary value is %s", binaryString);
		
		inputScanner.close();
	}
}
