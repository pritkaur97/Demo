package PCT;

import java.util.Scanner;

public class CheckPalindrome {
	static int palindrome(int arr[], int start , int end)
	{
		if(start>=end)
		{
			return 1;
		}
		if(arr[start]==arr[end])
		{
			return palindrome(arr, start+1, end-1);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr=new int[N];
			for(int i=0; i<N; i++)
			{
				arr[i]=sc.nextInt();
			}
		int n = arr.length;
		if(palindrome(arr,0,n-1)==1)
			System.out.println("palindrome");
		else
		{
			System.out.println("not a palindrome");

		}
;	}
}
