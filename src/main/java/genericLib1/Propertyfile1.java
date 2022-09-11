package genericLib1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile1 {
	
	public String getPropertyfile1(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
