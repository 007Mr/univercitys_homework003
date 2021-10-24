package 第三次Java作业;

public class work5_33 {
	public static void main(String[] args) {
		System.out.print("The prefect numbers are ");
		for(int number = 2;number < 10000;number++)
		{
			int divisorSum = 0;
			for(int i = 1;i < number;i++)
				if(number % i == 0)
					divisorSum += i;
			if(number == divisorSum)
				System.out.printf("%d ",number);
		}
	}
}
