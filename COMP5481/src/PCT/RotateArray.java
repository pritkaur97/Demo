package PCT;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int size=scan.nextInt();
		int number=scan.nextInt();
		int[] arr=new int[size];
			for(int i=0; i<size; i++)
			{
				arr[i]=scan.nextInt();
			}
			calculate(arr,number);
			scan.close();
		}

	private static void calculate(int[] arr, int number) {
		// TODO Auto-generated method stub
		
	}
	
	
		
}
