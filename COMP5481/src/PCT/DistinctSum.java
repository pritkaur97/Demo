package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctSum {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int total=sc.nextInt();
		int totalnum=sc.nextInt();
		
		int[] numArray= new int[totalnum];
		
		for(int i=0; i<totalnum; i++)
		{
			numArray[i]= sc.nextInt();
		}
		//System.out.println(Arrays.toString(numArray));
		if(totalnum<=12 && totalnum>=1 && total<1000) {
		getCount(numArray,total);
		sc.close();
	}}
	public static void getCount(int[] numArray, int total) {
		int count=0;
		for(int i=0; i < numArray.length; i++)
		{
			if(numArray[i]== total)
			{
				count++;
			}
			//for(int n=i+1; n < i; n++) {
			for(int j= i+1; j < numArray.length; j++)
				
			{
				//for(int k=j+1; k< numArray.length; k++)
				if((numArray[i] + numArray[j] == total))
				{
					count++;
				}
				
				//System.out.println("j =" + j);
		
			}
			//System.out.println("i =" + i);
		}
		
		System.out.println(count);
	}
}
