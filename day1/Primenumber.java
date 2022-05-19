package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		//input = 13
		int input = 1;
		int flag = 0;
		if (input==0 || input ==1) {
			System.out.println("It's a Prime");
		}else {
			for (int i =2; i<= input/2; i++) {
				if (input%i ==0) {
					System.out.println("Not a Prime");
					flag = 1;
					break;
				}
			}
			if (flag ==0) {
				System.out.println("It's a Prime");
			}
		}
	}
}
