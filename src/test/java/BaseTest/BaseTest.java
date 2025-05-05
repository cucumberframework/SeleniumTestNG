package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

	public static Properties prop;
	
	//public static String r="Test";

	public static Properties init() throws IOException {

		if (prop == null) {
			prop = new Properties();

			try {
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir")+"//src//test//java//ExternalFiles//properties.properties");
				prop.load(fis);
				
				System.out.println(prop.getProperty("browser"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return prop;

	}

}
