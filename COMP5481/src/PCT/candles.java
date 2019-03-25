package PCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age = scan.nextInt();
		int[] arr=new int[age];
		for(int i=0; i<age; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		findcandle(arr, age);
	}

	private static int findcandle(int[] arr, int age) {
		// TODO Auto-generated method stub
	
		int count=1;
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
				if(arr[i]>max)
				{
					
					arr[i]=max;
				}
				else if(arr[i]<max) {
					
					arr[i+1]=max;
				}
			
				else if(arr[i]==max)
				{
				 count++;
				
				}
				
		}
		System.out.println(count);
		return count;
		
	}

}
