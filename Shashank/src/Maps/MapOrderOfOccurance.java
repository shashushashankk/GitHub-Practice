package Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapOrderOfOccurance 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,20,30,10,20,10,20,30,50,40,50};
		LinkedHashMap<Integer, Integer> l1= new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) 
		{
			if(!l1.containsKey(arr[i]))
			{
				l1.put(arr[i], 1);
			}
			else
			{
				int x=l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for(Entry a:l1.entrySet())
		{
			System.out.println(a.getKey()+"	"+a.getValue());
		}
		
	}

}
