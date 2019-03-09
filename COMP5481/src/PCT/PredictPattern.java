package PCT;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PredictPattern {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		String input="";
		for(int i=0; i<lines; i++)
		{
			input +=" "+ sc.nextLine();
		}
		int ngram=sc.nextInt();
		if(ngram < 1 || ngram > 3)
			return;
		String ngramReturn="";
		switch(ngram)
		{
		case 1: ngramReturn= "Unigram ";
			int[] uni= new int[26];
			for(int i=0; i<lines; i++)
			{
				StringTokenizer st= new StringTokenizer(input," ");
				while(st.hasMoreTokens())
				{
					String word=st.nextToken();
					for(int j=1; j<word.length(); j++ )
					{
						uni[word.charAt(j)-'a']++;
						
					}
				}
			}
				int ubest=0;
				int ubesti=0;
				for(int i=0; i<26;i++)
				{
					if(uni[i]>ubest)
					{
						ubesti=i;
					    ubest=uni[i];
						
					}
				}
		
				System.out.println(ngramReturn+(char)(ubesti+'a'));
			
		break;
		case 2: ngramReturn= "Bigram ";
			
			int[][] bi = new int[26][26];
	
			for(int i=0; i<lines;i++)
			{
				StringTokenizer s = new StringTokenizer(input," ");
				while(s.hasMoreTokens())
				{
					String word = s.nextToken();
					for(int j=1;j<word.length();j++)
					{
						bi[word.charAt(j-1)-'a'][word.charAt(j)-'a']++;
					}
				}
			}
			int bbest = 0;
			int bbesti =0;
			int bbestj = 0;
			for(int i=0;i<26;i++)
			{
				for(int j=0;j<26;j++)
				{
					if(bi[i][j]>bbest)
					{
						bbesti = i;
						bbestj = j;
						bbest = bi[i][j];
					}
				}
			}
			System.out.println(ngramReturn+(char)(bbesti+'a')+(char)(bbestj+'a'));
		break;
		case 3: ngramReturn= "Trigram ";
			int[][][] tri=new int[26][26][26];
			for(int i=0; i<lines; i++)
			{
				StringTokenizer s=new StringTokenizer(input," ");
				while(s.hasMoreTokens())
				{
					String word=s.nextToken();
					for(int j=2; j<word.length(); j++)
					{
						tri[word.charAt(j-2)-'a'][word.charAt(j-1)-'a'][word.charAt(j)-'a']++;
						
					}
				}
			}
			int tbest=0;
			int tbesti=0;
			int tbestj=0;
			int tbestk=0;
			for(int i=0; i<26; i++)
			{
				for(int j=0; j<26; j++)
				{
					for(int k=0; k<26; k++)
					{
						if(tri[i][j][k]>tbest)
						{
							tbesti= i;
							tbestj= j;
							tbestk= k;
							tbest= tri[i][j][k];
						}
					}
				}
				
			}
			System.out.println(ngramReturn+(char)(tbesti+'a')+(char)(tbestj+'a')+(char)(tbestk+'a'));

		break;
		}
			sc.close();

	}
}
