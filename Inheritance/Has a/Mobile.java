class Mobile{
	String name;
	String brand;
	byte ram;
	Bettery bettery;
	
	Mobile(String name,String brand,byte ram,Bettery bettery){
		this.name=name;
		this.brand=brand;
		this.ram=ram;
		this.bettery=bettery;
	}
	void getDetails(){
		System.out.println(name+"\t"+brand+"\t"+ram+"\t"+bettery.getDetail());
	}
}