package Task11_pgm;

public class Q5_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Hello world";
		try
		{
			char obj = str.charAt(-1);
			char obj1 = str.charAt(11);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.err.println("StringIndexOutOfBoundsException: Sample File");
			e.printStackTrace();
		}
	}

}
