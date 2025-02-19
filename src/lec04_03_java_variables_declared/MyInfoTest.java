package lec04_03_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		// Constructor Initialized
		MyInfo tofael = new MyInfo();
		// object is used to initialize variable ---> value assigned for cvariables
		// variables Initialized
		tofael.myName = "Mohammad Sharkar";
		tofael.myAge = 99;
		tofael.myApartmentRent = 32222;
		tofael.myYearlySalary = 249783;
		tofael.myBankBalance = 572367364823l;
		tofael.myHeight = 1.632f;
		tofael.myGrade = 3.54798734;
		tofael.myGender = 'M';
		tofael.usCitizen = false;
		// method initialized
		tofael.myInfo();
		
		System.out.println("\n----------------------------------");
		MyInfo amber = new MyInfo();
		amber.myName = "Amber H";
		amber.myAge = 45;
		amber.myApartmentRent = 26000;
		amber.myYearlySalary = 453624361;
		amber.myBankBalance = 65842847263486l; 
		amber.myHeight = 1.87653f;
		amber.myGrade = 3.1221223;
		amber.myGender = 'F';
		amber.usCitizen = false;
		// method initialized
		amber.myInfo();
		
		System.out.println("\n----------------------------------");
		MyInfo aroah = new MyInfo();
		aroah.myName = "Aroah";
		aroah.myAge = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.myGender = 'F';
		aroah.usCitizen = false;
		// method initialized
		aroah.myInfo();
		
		System.out.println("\n----------------------------------");
		MyInfo unknown = new MyInfo();
		// Here object is not initializing any value
		unknown.myInfo();
		
		/*
		 You must know it:
		 Default value of String is null 
		 Default value of byte is 0
		 Default value of short is 0
		 Default value of int is 0
		 Default value of long is 0
		 Default value of float is 0
		 Default value of double is 0
		 Default value of char is an unicode which is not defined by eclipse IDE [not important]
		 Default value of boolean is false 
		 
		 Here, you must know default value for String, int and boolean [Important interview question]
		 */
		
		
		
		
		

	}

}
