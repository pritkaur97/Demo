package Demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		Scanner sc_in = new Scanner(System.in);
		int lines = sc_in.nextInt();
		String input = "";
		for(int i=0; i<lines;i++)
		{
			input += " " + sc_in.nextLine();
		}

		int ngram = sc_in.nextInt();
		if(ngram < 1 || ngram > 3)
			return;
		String ngramReturn = "";
		switch(ngram)
		{
		case 1: ngramReturn = "Uni";
		break;
		case 2: ngramReturn = "Bi";
		break;
		case 3: ngramReturn = "Tri";
		break;
		}
		int[][] bi = new int[26][26];

		for(int i=0; i<lines;i++)
		{
			StringTokenizer s = new StringTokenizer(input," ");
			while(s.hasMoreTokens())
			{
				String word = s.nextToken();
				for(int j=1;j<word.length();j++)
				{
					// charAt function returns the char value at the specified index.
					bi[word.charAt(j-1)-'a'][word.charAt(j)-'a']++;
				}
			}
		}
		int best = 0;
		int besti =0;
		int bestj = 0;
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<26;j++)
			{
				if(bi[i][j]>best)
				{
					besti = i;
					bestj = j;
					best = bi[i][j];
				}
			}
		}
		System.out.println(ngramReturn+"gram "+(char)(besti+'a')+(char)(bestj+'a'));
		sc_in.close();

	}


}


