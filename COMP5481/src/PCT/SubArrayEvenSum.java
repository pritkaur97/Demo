package PCT;

import java.util.Scanner;

public class SubArrayEvenSum {
	
	//find even and odd elements
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int N= input.nextInt();
		int[] arr=new int[N];
			 for(int i=0; i<N; i++)
			 {
				 arr[i]=input.nextInt();
			 }
		
		int n=arr.length;
		
		int count=0;
		for(int i=0; i<=n-1; i++)
		{
			int sum=0;
			for(int j=i; j<=n-1; j++)
			{
			sum=sum+arr[j];
			if(sum%2 == 0)
			{
			count++;	
			}
			}}
		System.out.println(count);
	}
}}
