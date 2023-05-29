package chapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperties {

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
		
		//step4:Fetch data using key
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("UN1"));
		System.out.println(property.getProperty("PWD1"));
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("time"));
		

	}

}
