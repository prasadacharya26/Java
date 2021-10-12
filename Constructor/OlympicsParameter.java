import java.util.Scanner;

class OlympicsParameter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter country name:");
		String name = scanner.nextLine();
		System.out.println("Enter total gold medal:");
		byte gold = scanner.nextByte();
		System.out.println("Enter total silver medal:");
		byte silver = scanner.nextByte();
		System.out.println("Enter total bronze medal:");
		byte bronze = scanner.nextByte();
		System.out.println("Enter rank:");
		byte rank = scanner.nextByte();
		Nation nation = new Nation(rank,name,gold,silver,bronze);
		nation.details();
	}
}