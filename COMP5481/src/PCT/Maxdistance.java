package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class Maxdistance {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int size= scan.nextInt();
		int[] array=new int[size];
			for(int i=0; i<size; i++)
			{
				array[i]=scan.nextInt();
			}
		calulate(array, size);
	}

	private static void calulate(int[] array,int size) {

		for(int i=0; i<size; i++)
		{
			for(int j=1; j<size; j++)
			{
				if(array[i] == array[j])
				{
					System.out.println(Arrays.asList(array).indexOf(4));
				}
			}
		}
	}

}
