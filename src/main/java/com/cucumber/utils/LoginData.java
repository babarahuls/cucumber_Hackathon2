package com.cucumber.utils;

public class LoginData {

    private static String userid;
    private static String credential;
  
	public LoginData() {

		// Reading data from Excel
		ReadExcelFile file;
		try {
			file = new ReadExcelFile();
			
			Object[][] data1 = file.ReadExcelFile("C:\\Users\\Baba Rahul\\Desktop\\java\\Cucumber_Group_Hackathon\\ExcelData",
					"ExcelData.xlsx", "Sheet2");

			// Assigning values to the data read from excel
			userid = data1[1][0].toString();
		    credential = data1[1][1].toString();
		
		
					

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// methods for every variable
	  public String uid() {
			return userid;
			
		}
	 

	    public  String credpass() {
	        return credential;
	    }
	     
}

