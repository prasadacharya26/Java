import java.util.Scanner;

class IPLString{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter player name:");
		String name = scanner.nextLine();
		RCBString.player(name);
	}
}