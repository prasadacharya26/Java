import java.util.Scanner;

class CountryDetails{
	Country []countries = new Country[0];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		CountryDetails details = new CountryDetails();
		String ans = null;
		do{
			System.out.println("");
			System.out.print("1.Add\t 2.Display\t 3.Update\t 4.Exit\n");
			System.out.print("Enter your choice:");
			int choice = scanner.nextInt();
			
			if(choice == 1)
				details.save();
			else if(choice == 2)
				details.display();
			else if(choice == 3)
				details.update();
			//scanner.nextLine();
			//System.out.println("");
			System.out.println("\nDo you want to continue:type yes otherwise type anything:");
		    ans = scanner.next();
		}while(ans.equals("yes"));
	}
	
	void save(){
		System.out.print("Enter number of country:");
		byte n = scanner.nextByte();
		countries = new Country[n];
		for(int i=0;i<countries.length;i++){
			scanner.nextLine();
			System.out.println("Enter country name:");
			String name = scanner.nextLine();
			System.out.println("Enter country capital:");
			String capital = scanner.nextLine();
			System.out.println("Enter country number of states:");
			byte states = scanner.nextByte();
			System.out.println("Enter country population:");
			short population = scanner.nextShort();
			
			Country country = new Country();
			country.setName(name);
			country.setCapital(capital);
			country.setNoofState(states);
			country.setPopulation(population);
			countries[i]=country;
		}
	}
	void display(){
		System.out.print("Name"+"\t\t"+"Captial"+"\t\t"+"No. of state"+"\t"+"Population\n");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0;i<countries.length;i++){
			//country = countries[i];
			String name = countries[i].getName();
			String capital = countries[i].getCapital();
			byte states = countries[i].getNoofState();
			short population = countries[i].getPopulation();
			System.out.println();
			System.out.print(name+"\t\t"+capital+"\t\t"+states+"\t\t"+population);
		}
	}
	void update(){
		scanner.nextLine();
		System.out.println("Enter country name:" );
		String cname = scanner.nextLine();
		boolean flag = false;
		for(int i = 0;i<countries.length;i++){
			String name = countries[i].getName();
			if(name.equals(cname)){
				System.out.println("Enter country population:" );
				short upopulation = scanner.nextShort();
				countries[i].setPopulation(upopulation);
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
}