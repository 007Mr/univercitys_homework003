package 第三次Java作业;

import java.util.*;
public class work3_19 {
	public static void main(String[] args) {
		double edge1,edge2,edge3,perimeterTriangle = 0;
		
		System.out.print("Enter the first edge of the triangle: ");
		Scanner input = new Scanner(System.in);
		edge1 = input.nextDouble();
		
		System.out.print("Enter the second edge of the triangle: ");
		edge2 = input.nextDouble();
		
		System.out.print("Enter the third edge of the triangle: ");
		edge3 = input.nextDouble();
		
		if(edge1+edge2>edge3 && edge1+edge3>edge2 && edge2+edge3>edge1)
			perimeterTriangle = edge1 + edge2 + edge3;
		else
			System.out.println("The input is invalid");
		
		if(perimeterTriangle != 0)
			System.out.println("The perimeter of the triangle is " + perimeterTriangle);
		
		input.close();
	}
}
