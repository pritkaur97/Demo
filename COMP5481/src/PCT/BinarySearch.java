package PCT;

import java.util.Scanner;

public class BinarySearch {
	int binarySearch(int arr[], int x)
	{
		int l=0 , r=arr.length-1;
		while(l<=r)
		{
			int m=l+(r-1)/2;
			// check if x is present at mid
			if(arr[m]==x)
				return m;
			// check if x is greater then ignore left half
			if(arr[m]<x)
				l= m+1;
			else
				// if x is small then ignore right half
				r=m-1;
		}
	
	return -1;
}
	public static void main(String[] args)
	{
		BinarySearch ob= new BinarySearch();
		//Scanner sc= new Scanner(System.in);
		//int N=sc.nextInt();
		//int arr[]= new int[];
		//int x=sc.nextInt();

		/*for(int i=0; i<N; i++)
		{
			arr[i]=sc.nextInt();
		}*/
		int arr[]= {1,2,3,4,5,6,7};
		int n= arr.length;
	
	int x= 4;
		int result=ob.binarySearch(arr, x);
		if(result==-1)
			System.out.print("Element not found");
		else
			System.out.print("Element found at "+ result);
	}
}
