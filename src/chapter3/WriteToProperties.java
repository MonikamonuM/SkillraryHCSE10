package chapter3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		//step1:Convert physical into Java readable object
		//new FileInputStream();throws FileNotFoundException
		FileInputStream fis=new FileInputStream("./testresources/data.properties");
		
		//step2:Create an instance for Properties object
		//Properties class is available in java.util.package
		Properties property=new Properties();
		
		//step3:Load all key value pairs into Properties object
		//load() throws IOException
		property.load(fis);
		
		//step4:Write data to properties
		property.put("UN2", "trainee");
		property.put("PWD2", "trainer");
		
		//step5:save data to properties file
		FileOutputStream fos=new FileOutputStream("./testresources/data.properties");
		property.store(fos, "updated successfully");
	}

}
