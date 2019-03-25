package PCT;

import java.util.Scanner;

public class RunLength {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str= input.nextLine();
		int n= str.length();
		
		if(n<20)
		{
			makePairs(str, n);
		}
	}
// make pairs
	private static void makePairs(String str, int n) {

		for(int i=0; i<n; i++)
		{
			int count=1;
			while(i<n-1 && str.charAt(i) == str.charAt(i+1))
			count++;
			i++;
			System.out.print("("+ str.charAt(i)+ ","+ count + ")");

		}
		}
	}


