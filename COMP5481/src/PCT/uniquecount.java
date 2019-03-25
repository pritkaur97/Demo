package PCT;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class uniquecount {
	private String name;
	private int value;
	uniquecount()
	{
		
	}
	uniquecount(String name,int value){
		this.name = name;
		this.value = value;
	}
	// find unique count
	static Map<String,Integer> hmap = new HashMap<>();
	public void calculate(String inputString)
	{
		String lowerCaseString = inputString.toLowerCase();
		String[] array = lowerCaseString.split("\\s+");
		Arrays.sort(array);
		List<String> newList = new ArrayList<String>();
		newList = Arrays.asList(array);
		for(int i=0;i<array.length;i++)
		{
			if(!hmap.containsKey(array[i]))
			{
			hmap.put(array[i], Collections.frequency(newList, array[i]));	
			}
		}
		System.out.println(hmap);

	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		uniquecount obj = new uniquecount();
		obj.calculate(inputString);
	}
}

