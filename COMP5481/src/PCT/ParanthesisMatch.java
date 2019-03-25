package PCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParanthesisMatch {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		scan.nextLine();
		String[] array=new String[N];
		
			for(int i=0; i<N; i++)
			{
				array[i]=scan.nextLine();
			}
			for(int i=0;i<N;i++)
			{
				Boolean x=(Match(array[i]));
				//System.out.println(x);
				if(x==true)
				{
					if(i==N-1)
						System.out.print("TRUE");
					else
					System.out.println("TRUE");
					
				}
				else
				{
					if(i==N-1)
						System.out.print("FALSE");
					else
					System.out.println("FALSE");
				}
			}
			
			scan.close();
	}

	// check balanced brackets
	private static Boolean Match(String string) {
		
		
		Stack<Character> stk=new Stack<>();
		
		char[] array = string.toCharArray();
		for(int i=0; i<array.length; i++)
		{
			char ch=array[i];
			if(ch=='(' || ch=='[' || ch=='{')
			{
				stk.push(ch);
			}
			
			if(ch==')')
			{
				Character top=stk.pop();
				if(top!='(')
					return false;
			}
			if(ch==']')
			{
				Character top=stk.pop();
				if(top!='[')
					return false;
			}
			if(ch=='}')
			{
				Character top=stk.pop();
				if(top!='{')
					return false;
			}
		}
		
		if(stk.size()==0)
		{
			return true;
		}
		return false;
	}

}
