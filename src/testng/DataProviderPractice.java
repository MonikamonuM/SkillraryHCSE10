package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider="dataForTickets")
	public void ticketBookingTest(String src, String dest) {
		System.out.println("From: "+src+"\t"+"To: "+dest);
	}
	@DataProvider
	public Object[][]dataForTickets(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="Bangalore";
		obj[0][1]="kochi";
		obj[1][0]="Bangalore";
		obj[1][1]="Hyderabad";
		obj[2][0]="Bangalore";
		obj[2][1]="Kolar";
		return obj;
	}

}
