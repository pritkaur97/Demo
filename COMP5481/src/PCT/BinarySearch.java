package PCT;

import java.util.Scanner;

public class BinarySearch {
	int binarySearch(int arr[], int x)
	{
		int first=0 , last=arr.length-1;
		while(first<=last)
		{
			int mid=first+(last-1)/2;
			// check if x is present at mid
			if(arr[mid]==x)
				return mid;
			// check if x is greater then ignore left half
			if(arr[mid]<x)
				first= mid+1;
			else
				// if x is small then ignore right half
				last=mid-1;
		}
	
	return -1;
}
	public static void main(String[] args)
	{
		BinarySearch ob= new BinarySearch();
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]= new int[N];
		

		for(int i=0; i<N; i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		/*int arr[]= {1,2,3,4,5,6,7};
		int n= arr.length;
		int x= 4; */	
		int result=ob.binarySearch(arr, x);
		if(result==-1)
		System.out.print("Element not found");
	else
		System.out.print("Element found at "+ result);
	}
}
