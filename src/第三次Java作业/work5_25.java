package 第三次Java作业;

public class work5_25 {
	public static void main(String[] args) {
		double piDivideByFour = 0;
		
		for(int i = 1;i <= 100000;i++)
		{
			piDivideByFour += Math.pow(-1, i+1) / (2 * i - 1);
			if(i % 10000 == 0)
				System.out.println("The PI value for i = " + i + " is " + piDivideByFour * 4);
		}
	}
}
