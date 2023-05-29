package Test_Script;

import org.testng.annotations.Test;

import pom_Script.Pom1;

public class Script1 {
@Test(dataProvider = "testdata")
public void test1(String d1, String d2)
{
	Pom1 p=new Pom1(driver);
	
	
}
}
