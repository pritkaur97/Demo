package PCT;



	import java.util.Scanner;

	public class Nickname {

		
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			int N=scan.nextInt();
			scan.nextLine();
			String[] input=new String[N];
			 for(int i=0; i<N; i++)
			 {
				input[i]=scan.nextLine(); 
			 }
			
			  findNickname(input, N);
		}

		private static void findNickname(String[] input, int n) {
			
			int sum=0;
			// TODO Auto-generated method stub
			for(int i=0; i<n; i++)
			{
				int max=1;
				for(int j=0; j<n; j++)
				{
					if(j!=i)
					{
						int returnedValue=finNickname1(input[i], input[j]);
						if(returnedValue>max)
						{
							max=returnedValue;
						}
					}
				}
				
				sum=sum+max;
			}
			System.out.print(sum);
		}

		private static int finNickname1(String inputString, String compareString) {
			// TODO Auto-generated method stub
			int count=0;
			for(int i=0; i<inputString.length(); i++)
			{
				
				if(inputString.charAt(i) == compareString.charAt(i))
				{
					count++;
				}
				else
					break;
			}
			return count+1;
		}

		
	}


