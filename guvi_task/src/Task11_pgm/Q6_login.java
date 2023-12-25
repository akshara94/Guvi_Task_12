package Task11_pgm;

import java.util.Scanner;

public class Q6_login extends Exception
{
	private static final String a = null;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the username :");
		String u = in.nextLine();
		
		System.out.printf("Enter the password : ");
		String p = in.nextLine();
		
		try
		{
		if(u.equals(p))
			System.out.println("Valid Login");
		else
			throw new Q6_login();
		
		}
		catch(Q6_login e)
		{
			System.out.println("Exception : "+a+" : Invalid Login");
			
			e.printStackTrace();
		}
	
		in.close();
	}
}