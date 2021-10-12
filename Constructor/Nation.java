class Nation{
	String name;
	byte rank;
	byte gold;
	byte silver;
	byte bronze;
	
	Nation(byte rnk,String country,byte gld,byte slver,byte brnze){
		name = country;
		rank = rnk;
		gold = gld;
		silver = slver;
		bronze = brnze;
	}
	void details(){
		System.out.println("");
		System.out.println("Country rank:"+rank);
		System.out.println("Country name:"+name);
		System.out.println("Medals");
		System.out.println("Gold:"+gold);
		System.out.println("Silver:"+silver);
		System.out.println("Bronze:"+bronze);
	}
}