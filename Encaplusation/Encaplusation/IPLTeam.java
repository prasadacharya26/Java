import java.util.Scanner;

class IPLTeam{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		IPL iplteam = new IPL();
		System.out.print("Enter number of IPL team:");
		byte n = scanner.nextByte();
		IPL []ipl = new IPL[n];
		while(true){
			System.out.println("");
			System.out.print("1.Add\t 2.Display\t 3.Exit\n");
			System.out.print("Enter your choice:");
			int choice = scanner.nextInt();
			
			if(choice == 1){
				for(int i=0;i<ipl.length;i++){
					scanner.nextLine();
					System.out.println("Enter IPL team name:");
					String name = scanner.nextLine();
					System.out.println("Enter team captain:");
					String captain = scanner.nextLine();
					System.out.println("Enter team coach:");
					String coach = scanner.nextLine();
					System.out.println("Enter team total won:");
					byte won = scanner.nextByte();
					System.out.println("Enter team total points:");
					byte points = scanner.nextByte();
					
					iplteam.setName(name);
					iplteam.setCaptain(captain);
					iplteam.setCoach(coach);
					iplteam.setTotalWon(won);
					iplteam.setPoints(points);
					ipl[i]=iplteam;
				}
			}
			else if(choice == 2){
				System.out.println();
				System.out.print("Name"+"\t\t"+"Captain"+"\t\t"+"Coach"+"\t\t"+"Won"+"\t"+"Points\n");
				System.out.println("--------------------------------------------------------------");
				for(int i = 0;i<ipl.length;i++){
					//iplteam = ipl[i];
					String tname = ipl[i].getName();
					String tcaptain = ipl[i].getCaptain();
					String tcoach = ipl[i].getCoach();
					byte twon = ipl[i].getTotalWon();
					byte tpoints = ipl[i].getPoints();
					System.out.println();
					System.out.print(tname+"\t\t"+tcaptain+"\t\t"+tcoach+"\t\t"+twon+"\t"+tpoints);
				}
			}
			else if(choice == 3){
				break;
			}
		}
	}
}