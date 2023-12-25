package Task11_pgm;

public class Q7InvalidException extends Exception {
	
	public Q7InvalidException(String str) {
		super(str);
	}
	public void MyInvalid(int age)
	{
		try
		{
			if(age>=18)
			{
				System.out.println("eligible for the vote");
			}
			else
			{
				throw new Q7InvalidException("InvalidAgeException");
			}
			
			}
		catch(Q7InvalidException e)
		{
			e.printStackTrace();
		}
	}
}

	