import java.util.Scanner;

class IPL{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Team Players");
		RCB.players("Virat Kohli","AB de Villiers","Devdutt Padikkal");
		System.out.println("Enter a player name:");
		String player = scanner.nextLine();
		System.out.println("");
		RCB.players(player);
	}
}