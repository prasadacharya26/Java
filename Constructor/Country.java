class Country{
	String name;
	byte glod;
	byte silver;
	byte bronze;
	
	Country(){
		
	}
	void details(){
		System.out.println("Country name:"+name);
		System.out.println("Medals");
		System.out.println("Gold:"+glod);
		System.out.println("Silver:"+silver);
		System.out.println("Bronze:"+bronze);
	}
}