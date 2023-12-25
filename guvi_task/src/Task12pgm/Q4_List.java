package Task12pgm;

import java.util.ArrayList;
import java.util.List;

public class Q4_List {

	public static void main(String[] args) 
	{
	List<String> obj = new ArrayList<String>();
	
	obj.add("A");
	obj.add("B");
	obj.add("C");
	obj.add("D");
	
	String[] objArray = obj.toArray(new String[obj.size()]);
	for(String obj1 : objArray)
	{
		System.out.println(obj);
	}

	}

}
