package PCT;

import java.util.Scanner;

public class ReachOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		while(N-->0)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int[][] origin=new int[n+1][m+1];
			origin[0][0]=1;
			calculate(origin, n , m);
		}
		scan.close();
	}

	private static void calculate(int[][] origin, int n, int m) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=m; i++)
			{
				if(i==0 && j==0)
				{
					continue;
				}
				if(j>0)
				{
					origin[i][j]+=origin[i][j-1];
				}
				if(i>0)
				{
					origin[i][j]+= origin[i-1][j];
				}
			}
		}
		System.out.println(origin[n][m]);
	}

}



