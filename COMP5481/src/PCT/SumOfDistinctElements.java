package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDistinctElements {
	static int distinctSum( int arr[], int n) {
		int res=1;
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
				if(i==j)
				{
					res++;
				}
			}
			
		}	
		Arrays.sort(arr);
		int sum= arr[0];
			for(int i=0; i<n-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					sum+= arr[i+1];
				}
			}
		return sum;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
				for(int i=0; i<N; i++)
				{
					arr[i]=sc.nextInt();
				}
		int n= arr.length;		
		System.out.println(distinctSum(arr, n));
	}
}
