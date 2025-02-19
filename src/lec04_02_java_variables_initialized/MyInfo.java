package lec04_02_java_variables_initialized;

public class MyInfo {

	// variable initialized
	public String myName = "Tofael Kabir";
	public byte myAge = 100;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 345575423;
	public long myBankBalance = 8756345323865461l;
	public float myHeight = 1.64327f;
	public double myGrade = 3.587465763874658764;
	public char myGender = 'M';
	public boolean usCitizen = true;
	
	// Constructor declared
	public MyInfo () {
		System.out.println("----:My Info Below:----");
	}
	
	// method implemented
	public void myInfo() {
		System.out.println("My Name: " + myName + ", My Age: " + myAge 
				+ ", My Apartment Rent: " + myApartmentRent + ", My Yearly Salary: " + myYearlySalary
				+ ", My Bank Balance: " + myBankBalance + ", My Gender: " + myGender 
				+ ", My Citizenship: " + usCitizen + ", My Height: " + myHeight + ", My Grade: " + myGrade);
	}

}
