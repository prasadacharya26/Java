import java.util.Scanner;

class EvenOdd{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		if( number % 2 == 0){
			System.out.println("Even Number");
		} else{
			System.out.println("Odd Number");
		}	
	}
}