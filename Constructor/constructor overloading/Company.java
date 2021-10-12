import java.util.Scanner;
class Company{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		byte id = scanner.nextByte();
		System.out.println("Enter name:");
		String name = scanner.next();
		System.out.println("Enter email id:");
		String email = scanner.next();
		System.out.println("Enter contact number:");
		Long contact = scanner.nextLong();
		
		Wolken wolken = new Wolken();
		byte number = 111;
		Wolken wolken1 = new Wolken(number);
		Wolken wolken2 = new Wolken(id,name,email,contact);
		
		wolken.detailDefault();
		wolken1.detailSingle();
		wolken2.detailParameter();
	}
}