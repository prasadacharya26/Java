import java.util.Scanner;
public class Scientist{
	static Scanner scanner=new Scanner(System.in);
	private String name;
	private byte no_of_year;
	private String role;
	private Address address=new Address();
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNoOfYear(byte no_of_year){
		this.no_of_year=no_of_year;
	}
	public byte getNoOfYear(){
		return no_of_year;
	}
	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return role;
	}
	void setAddress(){
		System.out.println("Enter house No");
		byte houseNo=scanner.nextByte();
		scanner.nextLine();
		System.out.println("Enter Area");
		String area=scanner.nextLine();
		System.out.println("Enter City");
		String city=scanner.nextLine();
		System.out.println("Enter State");
		String state=scanner.nextLine();
		System.out.println("Enter Country");
		String country=scanner.nextLine();
		System.out.println("Enter pincode");
		Long pincode=scanner.nextLong();
		scanner.nextLine();
			
		address.setHouseNo(houseNo);
		address.setArea(area);
		address.setCity(city);
		address.setState(state);
		address.setCountry(country);
		address.setPincode(pincode);
	}
	public void setAddress(Address address){
		this.address=address;
	}
	Address getAddress(){
		return address;
	}
	
}