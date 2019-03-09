package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
	public static void countFreq(int arr[] , int n)
	{
		boolean visited[] =new boolean[n];
		Arrays.fill(visited , false);
		 // traverse array elements
		for(int i=0; i<n; i++)
		{
			//skip if visited
			if (visited[i]== true)
			{
				continue;
			}
		int count=1;
		// count frequency
		for(int j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				visited[j]=true;
				count++;
			}
		}
		System.out.println(arr[i]+ " freq "+count);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr=new int[N];
			for(int i=0; i<N; i++)
			{
				arr[i]=sc.nextInt();
			}
		int n=arr.length;
		countFreq(arr, n);
	}
}
