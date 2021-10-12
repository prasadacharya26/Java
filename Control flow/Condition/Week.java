import java.util.Scanner;

class Week{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number (1 - 7):");
		byte number = scanner.nextByte();
		if(number > 7){
			System.out.println("Please enter valid number");
		}
		if(number == 1){
			System.out.println("Sunday");
		}
		if(number == 2){
			System.out.println("Monday");
		}
		if(number == 3){
			System.out.println("Tuesday");
		}
		if(number == 4){
			System.out.println("Wednesday");
		}
		if(number == 5){
			System.out.println("Thursday");
		}
		if(number == 6){
			System.out.println("Friday");
		}
		if(number == 7){
			System.out.println("Saturday");
		}
	}
}