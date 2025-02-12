package lec03_java_variables;

// Another example like MyInfo
public class Vehicle {
	// access modifier: public, private, protected, default is used below
	public String carName = "Cadillac";
	private int carPrice = 65000;  // private can be accessed in the same class
	protected boolean madeInUSA = true;
	char carGrade = 'A'; // in default type, you don't need to write anything like private, public, protected
	float carReview = 9.67543f;
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.carName);
	}
	

	
	

}
