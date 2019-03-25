package PCT;

import java.util.HashMap;
import java.util.Scanner;

public class MinWindow {
	
	public static void main(String[] args)
	{
		MinWindow mWinStr = new MinWindow();
		Scanner sc=new Scanner(System.in);
		String Str=sc.nextLine();
		String Letters= sc.nextLine();
		/*if(str.length()<=70 && letters.length()<=str.length())
		{*/
			System.out.println(mWinStr.findMinWindow(Str,Letters));
		//}
		
		
	}
	public String findMinWindow(String str,String letters) {
		//System.out.println("input works");
		if(letters.length() > str.length() || str.length()>70)
		{
			return "";
		}
		
		String minWin = "";
		
		
		
		HashMap<Character, Integer> target = new HashMap<Character, Integer>();
		
		for(int i=0; i<letters.length(); i++)
		{
			char ch = letters.charAt(i);
			
			if(target.containsKey(ch))
			{
				target.put(ch,target.get(ch)+1);
			}
			else
			{
				target.put(ch,1);
			}
		}
		
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int Lwin = 0;
		int minSize = str.length()+1;
		
		int freq = 0; 
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(target.containsKey(ch))
			{
				if(map.containsKey(ch))
				{
					if(map.get(ch)<target.get(ch))
					{	
						freq++;
					}
					
					map.put(ch,map.get(ch)+1);
				}
				else
				{
					map.put(ch,1);
					freq++;
		
				}
			}
			
			if(freq == letters.length())
			{
				char scan = str.charAt(Lwin);
				
				while (!map.containsKey(scan) || map.get(scan) > target.get(scan)) 
				{
					if (map.containsKey(scan) && map.get(scan) > target.get(scan))
					{
						map.put(scan, map.get(scan) - 1);
					}
					
					Lwin++;
					scan = str.charAt(Lwin);
				}
				
				if (i - Lwin + 1 < minSize) 
				{
					minWin = str.substring(Lwin, i + 1);
					minSize = i - Lwin + 1;		
				}
			}
		}
	 
		return minWin;
	
	
		
	}
}
