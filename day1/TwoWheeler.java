package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirror = 3;
	long chassisNumber = 225901L;
	boolean isPunctured = true;
	String bikeName = "Passion";
	double runningKM = 6400.56;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwoWheeler myBike = new TwoWheeler();
System.out.println(myBike.noOfWheels);
System.out.println(myBike.noOfMirror);
System.out.println(myBike.chassisNumber);
System.out.println(myBike.isPunctured);
System.out.println(myBike.bikeName);
System.out.println(myBike.runningKM);
	}

}
