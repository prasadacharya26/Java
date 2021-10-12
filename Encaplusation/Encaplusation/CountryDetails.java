import java.util.Scanner;

class CountryDetails{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Country country = new Country();
		System.out.print("Enter number of country:");
		byte n = scanner.nextByte();
		Country []countries = new Country[n];
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
					
			country.setName(name);
			country.setCapital(capital);
			country.setNoofState(states);
			country.setPopulation(population);
			countries[i]=country;
		}
			
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
}