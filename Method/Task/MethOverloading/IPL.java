import java.util.Scanner;

class IPL{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		RCB.players();
		System.out.println("********************");
		System.out.println("Enter two player name:");
		String player5 = scanner.nextLine();
		String player6 = scanner.nextLine();
		RCB.players(player5,player6);
		System.out.println("********************");
		RCB.players("KS Bharat","Harshal Patel","Phillippe");
		System.out.println("********************");
		System.out.print("Enter coach name:");
		String name = scanner.nextLine();
		RCB.coach(name);
	}
}