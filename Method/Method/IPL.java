import java.util.Scanner;

class IPL{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		RCB.players();
		System.out.println("********************");
		System.out.print("Enter coach name:");
		String name = scanner.nextLine();
		RCB.coach(name);
		System.out.println("********************");
		System.out.print("Enter total match won:");
		int total = scanner.nextInt();
		System.out.println("Total match won:"+ RCB.won(total));
		System.out.println("********************");
		System.out.println("Total point:"+ RCB.point(total));
	}
}