package PCT;

import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		calculate(a);
		scan.close();
	}
// find sum 
	private static void calculate(int a) {

		int sum=0;
		for(int i=1; i<=a; i++)
		{
			sum=sum+i;
		}
		System.out.print(sum);
	}

}
