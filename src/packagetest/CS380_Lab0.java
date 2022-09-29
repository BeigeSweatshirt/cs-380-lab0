//package packageTest;

public class CS380_Lab0 {

	public static void main(String[] args) {
		System.out.println("First Lab CS 380");
		reverseNumber(12345);
	}	

	public static void reverseNumber(int num) {
		int revNum = 0;
		while (num != 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		System.out.println(revNum);
	}
}
