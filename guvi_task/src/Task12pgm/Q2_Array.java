package Task12pgm;

import java.util.ArrayList;

public class Q2_Array
{
    
	public static void main(String[] args)
	{
		
		//create an empty list
	ArrayList<String> listcity = new ArrayList<String>();
		
	//Adding elements of list
		listcity.add("Delhi");
		listcity.add("Mumbai");
		listcity.add("Bangalore");
		listcity.add("Chennai");
		
		//printing intial value of array list
		
		System.out.println("ArrayList: "+ listcity);
		System.out.println("Size of ArrayList = " + listcity.size());
		
		listcity.clear();//remove all elements using clear() method
		
		System.out.println("\nAfter clear\n\n" + "ArrayList: " + listcity);
		System.out.println("Size of ArrayList = " + listcity.size());
		

	}

}
