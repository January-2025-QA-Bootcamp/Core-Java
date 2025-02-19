package lec04_01_java_variables;

public class MyInfo {

	// variable initialized
	
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	public String myName = "Tofael Kabir";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	public byte myAge = 100;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 345575423;
	public long myBankBalance = 8756345323865461l;
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, 
	// but when you cross the range of int, you must have to use l, example: 2147483648
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.64327f;
	// we must have to use lower case f, at the end of float value	
	public double myGrade = 3.587465763874658764;
	
	// Above 6 types are used for number, values are represented with no quotation
	// Important: Mostly int is used for complete number and float for decimal number
	public char myGender = 'M';
	public boolean usCitizen = true;
	
	// Constructor declared
	public MyInfo () {
		System.out.println("----:My Info Below:----");
	}
	
	// Inside class, method is implemented [not declared], important information
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case feature or snake case pattern
	// but, this is not mandatory to make a method name same as class name
	
	// camel case
	public void busStop() {
		System.out.println("I am a bus Stop method");
	}
	
	// there can be more than one method inside a class with different name [not with same name]
	// snake case
	public void study_tour() {
		System.out.println("I am a study tour method");
	}
	
	// method name can be same as class name, but in lower case
	public void myInfo() {
		// method body
		System.out.println("I am a myInfo method");
		// When variables are called inside method, we don't need object
		System.out.println(myName);
		System.out.println("My Name: " + myName);
		System.out.println("My Name: " + myName + ", My Age: " + myAge 
				+ ", My Apartment Rent: " + myApartmentRent + ", My Yearly Salary: " + myYearlySalary
				+ ", My Bank Balance: " + myBankBalance + ", My Gender: " + myGender 
				+ ", My Citizenship: " + usCitizen + ", My Height: " + myHeight + ", My Grade: " + myGrade);
	}
	

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor Initialized when we create object
		
		System.out.println("My Name: " + tofael.myName + ", My Age: " + tofael.myAge 
				+ ", My Apartment Rent: " + tofael.myApartmentRent + ", My Yearly Salary: " + tofael.myYearlySalary
				+ ", My Bank Balance: " + tofael.myBankBalance + ", My Gender: " + tofael.myGender 
				+ ", My Citizenship: " + tofael.usCitizen + ", My Height: " + tofael.myHeight + ", My Grade: " + tofael.myGrade);

		// method initialized
		tofael.busStop(); // object can initialize a method
		tofael.study_tour();
		tofael.myInfo();
		
	
	
	}

}
