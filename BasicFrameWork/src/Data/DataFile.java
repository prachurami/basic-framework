package Data;

import utilities.Xls_Reader;

public class DataFile {
	
    Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.xlsx");
    
	//LoginTest
public 	String emailwithSpecialChar = d.getCellData("Data1", "UserName", 4);
public  String WrongEmail =d.getCellData("Data1", "UserName", 3);
public  String WrongPassword = d.getCellData("Data1", "Password", 2);
public 	String specialCharEmailErr= d.getCellData("Data1", "Email Error", 5);
public  String emptyEmailErr = d.getCellData("Data1", "Email Error", 4);
public  String emptyPasswordErr = d.getCellData("Data1", "Password Error", 3);
public  String globalErr =d.getCellData("Data1", "Global Error", 2);
    //Footer test
    
    //UserProfileTest
    
    //AddToCart
    
    //CheckOutTest
    
    // SerchTest
    
}
