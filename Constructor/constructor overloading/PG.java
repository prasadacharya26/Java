import java.util.Scanner;

class PG{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Hospital hospital = new Hospital();
		System.out.println(hospital.addmission(true));
		System.out.println(hospital.vaccancy(true));
		
		System.out.println("Enter food type:");
		String type = scanner.nextLine();
		System.out.println(hospital.food(type));
		
		System.out.println("");
		System.out.println("Enter id:");
		hospital.id=scanner.nextByte();
		System.out.println("Enter name:");
		hospital.name=scanner.next();
		System.out.println("Enter email:");
		hospital.email=scanner.next();
		System.out.println("Enter address:");
		hospital.address=scanner.next();
		System.out.println("Enter website:");
		hospital.website=scanner.next();
		System.out.println("Enter type:");
		hospital.type=scanner.next();
		System.out.println("Enter contact number:");
		hospital.contact=scanner.nextLong();
		
		System.out.println("");
		System.out.println("Id:"+hospital.id +" "+"Name:"+hospital.name);
		System.out.println("Email:"+hospital.email +" "+"Address:"+hospital.address);
		System.out.println("Website:"+hospital.website +" "+"Type:"+hospital.type);
		System.out.println("Contact number:"+hospital.contact);
		
	}
}