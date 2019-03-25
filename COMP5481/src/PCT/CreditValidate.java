package PCT;

import java.util.Scanner;

public class CreditValidate {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		 
		if(input.length()<20)
		{
			Validate(input);
		}
		scan.close();
	}

	private static void Validate(String input) {
		
		int[] array=new int[input.length()];
		
		for(int i=0; i<input.length(); i++)
		{
			array[i]=Integer.parseInt(input.substring(i,i+1));
		
		}
			//System.out.println(array);
		for(int i=array.length-2; i>=0; i= i-2)
		{
			int j= array[i]*2;
			
			if(j>9)
			{
				j=j%10+1;
				
			}
			array[i]=j;
		}
		int sum=0;
			for(int i=0; i<input.length(); i++)
			{
				sum= sum+array[i];
			}
		if(sum%10== 0)
		{
			System.out.print("VALID");
		}
		else
		{
			
			int nsum=0;
				for(int i=0; i<array.length-1; i++)
				{
					nsum=nsum+array[i];
				}
				int error=0;
			while((nsum+error)%10 !=0)
			{
				error++;
			}
			System.out.print("INVALID "+ error);
		}
				
	}

}
