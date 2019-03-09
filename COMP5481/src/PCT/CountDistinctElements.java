package PCT;

import java.util.Scanner;

public class CountDistinctElements {
	static int countDistinct(int arr[] ,int n)
	{
		int res =1;
		for(int i=1; i<n; i++)
		{
			int j=0;
			for(j=0; j<i; j++)
			{
				if(arr[i]==arr[j])
					break;
			}
			if(i==j)
				res++;
		}
		return res;
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
		//int arr[]= {1,2,3,4,4,4};
		int n=arr.length;
		System.out.println(countDistinct(arr, n));
	}
}
