package PCT;

import java.util.Scanner;

public class Ccvalid {
	public static void main(String[] args)
	{
		//get input from user
		Scanner sc=new Scanner(System.in);
		String cnum= sc.nextLine();
		//checking number length
		if(cnum.length()<20)
		CreditCardValidation(cnum);
		
		sc.close();
	}
    public static void CreditCardValidation(String str)
{
	int[] total=new int[str.length()];
	for(int i=0; i<str.length(); i++)
		{
		total[i]=Integer.parseInt(str.substring(i,i+1));
		
		}
	//doubling the sum of every second position
	for(int i=total.length-2; i>=0; i=i-2)
		{
		int j =total[i]*2;
		//sum of digits
		if(j>9)
		{
			j=j%10+1;
			}
		total[i]=j;
		
		}
	//total
	int sum=0;
	for(int i=0; i<str.length();i++)
		{
		sum+=total[i];
		
		}
	if(sum%10==0)
		{System.out.println("VALID");
		}
	else
		{
		// printing error position
		int nsum=0;
		for(int i=0; i<total.length-1;i++)
		{nsum+=total[i];
		}
		int errorpos=0;
		while((nsum+errorpos)%10!=0){
			errorpos++;
		}
		System.out.println("INVALID " +errorpos);
		}
	}

}
		
	


