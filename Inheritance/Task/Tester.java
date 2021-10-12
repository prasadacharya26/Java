import java.util.Scanner;

class Tester{
	static Scanner scanner=new Scanner(System.in);
	static Scientist []sc = new Scientist[20]; 
	int count=0;
	boolean save(Scientist scientist){
		if(count<sc.length){
			sc[count]=scientist;
			count++;
			return true;
		}else{
			return false;
		}
	}
	void getData(Scientist scientist){
		String name=scientist.getName();
		byte exp=scientist.getNoOfYear();
		String role=scientist.getRole();
		
		Address address=scientist.getAddress();
		byte houseno=address.getHouseNo();
		String area=address.getArea();
		String city=address.getCity();
		String state=address.getState();
		String country=address.getCountry();
		long pincode=address.getPincode();
		System.out.println(name+"\t\t"+exp+"\t\t"+role+"\t\t"+houseno+"\t\t"+area+"\t\t"+city+"\t\t"+state+"\t\t"+country+"\t\t"+pincode);
	}
	
	void display(){
		Scientist scientist=new Scientist();
		Tester test=new Tester();
		System.out.println("Name\t\tExperiance\tRole\t\tHouse no\t\tArea\t\tCity\t\tState\t\tCountry\t\tpincode");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<count;i++){
				scientist=sc[i];
				test.getData(scientist);
			}
	}
	
	Scientist displayone(String name){
		Scientist scientist=new Scientist();
		Tester test=new Tester();
		System.out.println("Name\t\tExperiance\tRole\t\tHouse no\t\tArea\t\tCity\t\tState\t\tCountry\t\tpincode");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<count;i++){
			scientist=sc[i];
			if(scientist.getName().equals(name)){
				test.getData(scientist);
			}
		}
		return null;
	}
	
	boolean update(String name,byte exp){
		Scientist scientist=new Scientist();
		for(int i=0;i<count;i++){
			scientist=sc[i];
			if(scientist.getName().equals(name)){
				scientist.setNoOfYear(exp);
				return true;
			}
		}
		return false;
	}
	
	boolean delete(String name){
		Scientist scientist=new Scientist();
		for(int i=0;i<count;i++){
			scientist=sc[i];
			if(scientist.getName().equals(name)){
				scientist.setName(null);
				scientist.setNoOfYear((byte)0);
				scientist.setRole(null);
				scientist.setAddress(null);
				count--;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		Tester tester =new Tester();
		String ans;
		do{
			System.out.println("save: Save the new data\ndisplay: Display all data\nedit: Update data\ndelete: Delete data\ndisplayone:Display one\nexit: Exit");
			String ch = scanner.next();
			if(ch.equals("save")){
				scanner.nextLine();
				System.out.println("Enter scientist name");
				String name=scanner.nextLine();
				System.out.println("Enter scientist experiance");
				byte exp=scanner.nextByte();
				scanner.nextLine();
				System.out.println("Enter scientist role");
				String role=scanner.nextLine();
				
				Scientist scientist=new Scientist();
				scientist.setName(name);
				scientist.setNoOfYear(exp);
				scientist.setRole(role);
				scientist.setAddress();
				boolean flag=tester.save(scientist);
				if(flag){
					System.out.println("Added Sucessfully");
				}else{
					System.out.println("Error");
				}
			}
			else if(ch.equals("display")){
				tester.display();
			}
			else if(ch.equals("displayone")){
				scanner.nextLine();
				System.out.println("Enter scientist name");
				String name=scanner.nextLine();
				Scientist scientist=tester.displayone(name);
			}
			else if(ch.equals("edit")){
				scanner.nextLine();
				System.out.println("Enter scientist name");
				String name=scanner.nextLine();
				System.out.println("Enter scientist experiance");
				byte exp=scanner.nextByte();
				boolean flag=tester.update(name,exp);
				if(flag){
					System.out.println("Update Sucessfully");
				}else{
					System.out.println("Error");
				}
			}
			else if(ch.equals("delete")){
				scanner.nextLine();
				System.out.println("Enter scientist name");
				String name=scanner.nextLine();
				boolean flag=tester.delete(name);
				if(flag){
					System.out.println("Delete Sucessfully");
				}else{
					System.out.println("Error");
				}
			}
			else if(ch.equals("exit")){
				break;
			}
			System.out.println("Do you want to continue type yes otherwise type anything:");
			ans=scanner.next();
		}while(ans.equals("yes"));
	}
}