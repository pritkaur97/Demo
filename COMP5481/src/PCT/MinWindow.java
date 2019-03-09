package PCT;

import java.util.Scanner;

public class MinWindow {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String letters= sc.nextLine();
		if(str.length()<=70 && letters.length()<=str.length())
		{
			findMinWindow(str,letters);
		}
		
		
	}
	public static void findMinWindow(String str,String letters) {
		//System.out.println("input works");
		
	}
}
