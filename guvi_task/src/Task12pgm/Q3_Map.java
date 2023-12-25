package Task12pgm;

import java.util.Map;
import java.util.TreeMap;


public class Q3_Map 
{
	public static void main(String[] args)
	{
	Map<String,Integer> mapobj = new TreeMap<String,Integer>();
	
	mapobj.put("Akshara", 123);
	mapobj.put("Priya", 234);
	mapobj.put("Hari",432);
	mapobj.put("Raja",456);
	

    for(String s : mapobj.keySet())
    	System.out.println(s);
}
}



