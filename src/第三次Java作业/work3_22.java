package 第三次Java作业;

import java.util.*;
public class work3_22 {
	public static void main(String[] args) {
double pointX,pointY,distance;
		
		System.out.print("Enter a point with two coordinates:");
		Scanner input = new Scanner(System.in);
		pointX = input.nextDouble();
		pointY = input.nextDouble(); 
		
		distance = Math.pow(Math.pow(pointX, 2) + Math.pow(pointY, 2), 0.5);
		
		if(distance <= 10)
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is in the circle");
		else
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is not in the circle");
		
		input.close();
	}
}
