package dataProviders;

import org.testng.annotations.DataProvider;

public class MydataProviders {	
	
@DataProvider(name="mydata")
public String[][] data()
{
	String [][]arr= {{"Hello","Adimn"},
	             {"username2","password2"},
	             {"usename3","password3"}};
	
  //we use return keyword to provide the data and control .
	return arr;
	
}

@DataProvider(name="mydata2")
public String[][] data2()
{
	String [][]arr= {{"Hello","Adimn"},
	             {"username2","password2"},
	             {"usename3","password3"}};
	
  //we use return keyword to provide the data and control .
	return arr;
	
}


}
