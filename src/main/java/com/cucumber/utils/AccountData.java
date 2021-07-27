package com.cucumber.utils;



public class AccountData {

		
	    private static String firstname;
	    private  static String lastname;
	    private static String emailid;
	    private static String confemailid;
	    private static String password;
	    private static String confpassword;
	   

		public AccountData() {

			// Reading data from Excel
			ReadExcelFile file;
			try {
				file = new ReadExcelFile();
				
				Object[][] data = file.ReadExcelFile("C:\\Users\\Baba Rahul\\Desktop\\java\\Cucumber_Group_Hackathon\\ExcelData",
						"ExcelData.xlsx", "Sheet1");

				// Assigning values to the data read from excel
				firstname = data[1][0].toString();
			    lastname = data[1][1].toString();
			    emailid = data[1][2].toString();
			    confemailid = data[1][3].toString();
			    password = data[1][4].toString();
			    confpassword = data[1][5].toString();
			
			  
						

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		// methods for every variable
		  public String fname() {
				return firstname;
				
			}
		 

		    public  String lname() {
		        return lastname;
		    }
		     public String email() {
		    	 return emailid;
		    	 
		     }
		     public String confemail() {
		    	 return confemailid;
		     }
		    public String passwd() {
		    	return password;
		    	
		    }
		    public String confpasswd() {
		    	return confpassword;
		    }
		  

}
