package Task11_pgm;
import java.io.FileInputStream;
import java.util.Properties;

public class Q8_FileException {

	public static void main(String[] args) {
		
		Q8_FileException obj = new Q8_FileException();
		obj.readdata();
	}
	public void readdata()
	{
		String value = null;
		Properties prop  = new Properties();
		try
		{
		FileInputStream ip = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\javafile.txt");
		prop.load(ip);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		value = prop.getProperty("address");
		System.out.println(value);

}

}

