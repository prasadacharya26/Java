class Furniture{
	String type;
	String brand;
	short price;
	
	Furniture(String name,String brnd,short prce){
		System.out.println("Calling constructor");
		type = name;
		brand = brnd;
		price = prce;
		System.out.println("Initialize");
	}
	
	void details(){
		System.out.println("Type:"+type);
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
}