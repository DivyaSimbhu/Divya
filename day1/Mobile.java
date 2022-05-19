package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Do the Call");
	}
	public void sendMsg() {
		System.out.println("Send the Message");
	}

	public static void main(String[] args) {
		System.out.println("Mobile Phone");
Mobile mymobile = new Mobile();
	mymobile.makeCall();
	mymobile.sendMsg();
	}
}


