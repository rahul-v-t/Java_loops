import java.util.Scanner;


public class Dowhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value =0;
		
		/*while(value!=5){
			System.out.println("Enter a value");
			value = input.nextInt();
		}*/
		do {
			System.out.println("Enter a value");
			value = input.nextInt();
		}
		while(value!=5);
		System.out.println("Got 5!");
	}
}