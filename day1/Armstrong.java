package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 153; 
int orgNum = input;
int sum = 0;
while (input>0) {
	int rem = input % 10;
	 sum = sum+(rem*rem*rem);
	 input  = input/10;
}
System.out.print(sum);
if (orgNum == sum) {
	System.out.println(" Armstrong number");
	}
else {
	System.out.println("Not a Armstrong number");
}
}
}
