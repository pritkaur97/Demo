package PCT;



	import java.util.Arrays;
	import java.util.Scanner;

	public class MinSum {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan=new Scanner(System.in);
			int N=scan.nextInt();
			int[] arr=new int[N];
			for(int i=0; i<N; i++)
			{
				arr[i]=scan.nextInt();
			}
			Calculate(arr, N);
			
		}

		private static void Calculate(int[] arr, int n) {

			Arrays.sort(arr);
			String stringCon = "";
			String stringCon1 ="";
			for(int i=0; i<n; i+=2)
			{
			
				stringCon = stringCon + arr[i];
			}
			for(int j=1; j<n; j+=2)
			{
				stringCon1= stringCon1 + arr[j];
			}
			int digit1=Integer.parseInt(stringCon);
			int digit2=Integer.parseInt(stringCon1);
			int sum=digit1+ digit2;
			System.out.println(sum);
		}

	}


