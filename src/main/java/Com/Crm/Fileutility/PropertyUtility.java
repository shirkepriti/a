package Com.Crm.Fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("F:\\eclipse\\com.crm.finalMock\\src\\test\\resources\\Configuration\\DemowebShop.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}

