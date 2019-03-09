package PCT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OccuredOnlyOnce {
	 public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int[] arr=new int[N];
				for(int i=0; i<N; i++)
				{
					arr[i]=sc.nextInt();
				}
			int n=arr.length;
			occuredOnce(arr,n);
			sc.close();
		}
	
	 static void occuredOnce(int arr[], int n)
	 {
			Arrays.sort(arr);
			//check first element
		for(int i=0; i<n; i++)
		 	{if(arr[0]==arr[i])
		 		System.out.println(arr[0]);
		 	}
		 	//check adjacent elements
		 	for(int i=1; i<n-1; i++)
		 	{
		 		if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
		 		{
		 		System.out.println(arr[i]);	
		 		}
		 	}
		 	if(arr[n-2]!=arr[n-1])
		 	{
		 		System.out.println(arr[n-1]);
		 	}
		 	
	 }
	
}
