package ������Java��ҵ;

import java.util.*;
public class work3_23 {
	public static void main(String[] args) {
double pointX,pointY;
		
		System.out.print("Enter a point with two coordinates:");
		Scanner input = new Scanner(System.in);
		pointX = input.nextDouble();
		pointY = input.nextDouble();
		
		if((pointX >= -5 && pointX <= 5) && (pointY >= -2.5 && pointY <= 2.5))
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is in the rectangle");
		else
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is not in the rectangle");

		input.close();

	}
}
