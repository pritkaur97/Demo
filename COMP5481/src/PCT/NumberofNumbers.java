package PCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberofNumbers {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		scan.nextLine();
		String numbers = scan.nextLine();
			
		int find=scan.nextInt();
		
			calculate(numbers, find);
	}

	private static void calculate(String numbers, int find) {
				
		 char[] array=new char[numbers.length()];
		 
		 array = numbers.toCharArray();
		 
		 int count =0;
		 
		 
		 for(int i=0;i<array.length;i++)
		 {
			 if(Character.getNumericValue(array[i]) == find)
				 count++;
		 }
		 System.out.print(count);
	}

}
