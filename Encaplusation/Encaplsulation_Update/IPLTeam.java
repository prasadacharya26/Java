import java.util.Scanner;

class IPLTeam{
	static Scanner scanner;
	//IPL iplteam = new IPL();
	IPL []ipl = new IPL[0];
	
	void add(){
		System.out.print("Enter number of IPL team:");
		byte n = scanner.nextByte();
		ipl = new IPL[n];
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
			
			IPL iplteam = new IPL();			
			iplteam.setName(name);
			iplteam.setCaptain(captain);
			iplteam.setCoach(coach);
			iplteam.setTotalWon(won);
			iplteam.setPoints(points);
			ipl[i]=iplteam;
			
		}	
	}
	
	void display(){
		System.out.println();
		System.out.print("Name"+"\t\t"+"Captain"+"\t\t"+"Coach"+"\t\t"+"Won"+"\t"+"Points\n");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0;i<ipl.length;i++){
			IPL ipl1 = ipl[i];
			String tname = ipl1.getName();
			String tcaptain = ipl1.getCaptain();
			String tcoach = ipl1.getCoach();
			byte twon = ipl1.getTotalWon();
			byte tpoints = ipl1.getPoints();
			System.out.println();
			System.out.print(tname+"\t\t"+tcaptain+"\t\t"+tcoach+"\t\t"+twon+"\t"+tpoints);
		}
	}
	void update(){
		scanner.nextLine();
		System.out.println("Enter team name:" );
		String tname = scanner.nextLine();
		boolean flag = false;
		for(int i = 0;i<ipl.length;i++){
			String name = ipl[i].getName();
			if(name.equals(tname)){
				System.out.println("Upadate team points:" );
				byte tpoints = scanner.nextByte();
				ipl[i].setPoints(tpoints);
				System.out.println("Successfully upadted..." );
				flag = true;
				break;
			}else{
				flag = false;
			}
		}
		if(flag == false){
			System.out.println("Not Found!!!" );
		}
	}
	
	public static void main(String[] args){
		scanner = new Scanner(System.in);
		IPLTeam iplTeam = new IPLTeam();
		String ans = null;
		do{
			//System.out.println("");
			System.out.print("1.Add\t 2.Display\t 3.Update\t 4.Exit\n");
			System.out.print("Enter your choice:");
			int choice = scanner.nextInt();
			
			if(choice == 1)
				iplTeam.add();
			else if(choice == 2)
				iplTeam.display();
			else if(choice == 3)
				iplTeam.update();
			else if(choice == 4)
				break;
			//scanner.nextLine();
			System.out.println("");
			System.out.println("\nDo you want to continue:type yes otherwise type anything:");
		    ans = scanner.next();
		}while(ans.equals("yes"));
	}
}