package PCT;

import java.util.ArrayList;
import java.util.Scanner;

public class PctTupleBasic {

	// find number of elements
	public void calculate(String inputString)
	{
		ArrayList<Character> inputList = new ArrayList<>();
		ArrayList<Integer> countList = new ArrayList<>();
		int startIndex = 0;
		Boolean flag = true;
		while(flag) {
			int returnedIndex = calculateCount(inputString,startIndex ,inputList,countList);
			startIndex = returnedIndex +1;
			if(startIndex>=inputString.length())
				flag = false;
		}
		
		for(int j=0;j<inputList.size();j++)
		{
			if(countList.get(j)==1)
				System.out.print(inputList.get(j));
			else
				System.out.print("(" + inputList.get(j) +"," + countList.get(j) + ")");
		}
	}
	
	public int calculateCount(String inputString,int startIndex,ArrayList<Character> inputList,ArrayList<Integer> countList)
	{
		int count =1;
		int finalIndex = startIndex;
		for(int i= startIndex;i<inputString.length()-1;i++)
		{
			if(inputString.charAt(i) == inputString.charAt(i+1)) {
				count++;
				finalIndex = i+1;
			}	
			else
				break;
		}

			inputList.add(inputString.charAt(startIndex));
			countList.add(count);
		
		
		return finalIndex;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString  = scan.nextLine();
		PctTupleBasic obj = new PctTupleBasic();
		obj.calculate(inputString);
	}

}
