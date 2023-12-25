package Task11_pgm;

public class Q5_Exception
{

	public static void main(String[] args) 
	{
	
	int a[] = new int [6];//declare an array of size 5
	

	try
	{
		System.out.println("The element of index 6 of the array is " +a[6]);
	
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("(ArrayIndexOutOfBoundsException: " + e.getMessage());
		
	}
	
	}
}

