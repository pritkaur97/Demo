package PCT;

import java.util.Arrays;
import java.util.Scanner;

public class HorizontalVertical {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int V=scan.nextInt();
		int H=scan.nextInt();
		String[] arrayV = new String[V];
		scan.nextLine();
		for(int i=0;i<V;i++)
		{
			arrayV[i] = scan.nextLine();
		}
		
		String[] arrayH = new String[H];
		for(int i=0;i<H;i++)
		{
			arrayH[i] = scan.nextLine();
		}
				
		CountIntersection(arrayV, arrayH);
	}
		// find intersect points
	private static void CountIntersection(String[] arrayV, String[] arrayH) {

		int count =0;
		for(int i=0; i<arrayV.length; i++)
		{
			for(int j=0; j<arrayH.length; j++)
			{
				String[] vertical=arrayV[i].split(" ");
				String[] horizontal=arrayH[j].split(" ");
				
				int xV= Integer.parseInt(vertical[0]);
				int y1V= Integer.parseInt(vertical[1]);
				int y2V=Integer.parseInt(vertical[2]);
				
				int yH= Integer.parseInt(horizontal[0]);
				int x1H= Integer.parseInt(horizontal[1]);
				int x2H= Integer.parseInt(horizontal[2]);
				
				if(xV>=x1H && xV<=x2H || xV<=x1H && xV>=x2H)
				{
					count++;
				}
		}
		
		
	}
		System.out.println(count);
	}
}
