package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class TranscriptName {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String fullname=scan.nextLine();
		String[] namearray=fullname.split("\\s+");

			printName(namearray);
			scan.close();
	}

	private static void printName(String[] namearray) {


			if(namearray.length == 3)
			{
				System.out.print(namearray[2]+" "+ namearray[0]+ " "+ namearray[1]);
			}
			if(namearray.length == 2)
			{
				System.out.print(namearray[1]+" "+ namearray[0]);
			}
			if(namearray.length == 1)
			{
				System.out.print(namearray[0]);
			}
//		}
	}

}
