package lec04_03_java_variables_declared;

public class MyInfo {

	// variable declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;
	
	// Constructor declared
	public MyInfo () {
		System.out.println("----:My Info Below:----");
	}
	
	// method implemented
	public void myInfo() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge 
				+ "\nMy Apartment Rent: " + myApartmentRent + "\nMy Yearly Salary: " + myYearlySalary
				+ "\nMy Bank Balance: " + myBankBalance + "\nMy Gender: " + myGender 
				+ "\nMy Citizenship: " + usCitizen + "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade);
	}

}
