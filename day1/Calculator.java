package week1.day1;

public class Calculator {

	public int add(int a, int b) {
	int sum = a  + b;
	return sum;
	}
	public double sub(double m, double n) {
		double  sub = m - n;
		return sub;
		}
	public double mul(double m, double n) {
		double  mul = m * n;
		return mul;
		}
	public int div(int a, int b) {
		int  div = a/ b;
		return div;
		}
	public static void main(String[] args) {
		Calculator cal = new Calculator ();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(5.5, 2));
		System.out.println(cal.mul(6, 2));
		System.out.println(cal.div(10, 2));		
	}

}
