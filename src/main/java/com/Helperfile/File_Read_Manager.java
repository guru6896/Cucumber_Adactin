package com.Helperfile;

public class File_Read_Manager {
	

	  //Constructor
	
	     private File_Read_Manager() {
	    	 
	    	 // it will restrict to create object in another class
			
		}
	
	
	  // static method

		public static File_Read_Manager getInstanceFRM() {

			File_Read_Manager frm = new File_Read_Manager();

			return frm;

		}

		// non static method

		public Configuration_Reader getInstanceCR() throws Throwable {

			Configuration_Reader cr = new Configuration_Reader();

			return cr;

		}

	





}
