package PCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		scan.nextLine();
		String numbers = scan.nextLine();
			
		int find=scan.nextInt();
		
			calculate(numbers, find);
	}

	private static void calculate(String numbers, int find) {
		// TODO Auto-generated method stub
		 //System.out.println(Arrays.toString(array));
		
		
		 char[] array=new char[numbers.length()];
		 
		 array = numbers.toCharArray();
//		 List<char[]> myList=new ArrayList<>();
//		 myList=Arrays.asList(array);
		 
		 
		 //System.out.println(Arrays.toString(array));
		 int count =0;
		 
		 
		 for(int i=0;i<array.length;i++)
		 {
			 if(Character.getNumericValue(array[i]) == find)
				 count++;
		 }
		 System.out.print(count);
	}

}
