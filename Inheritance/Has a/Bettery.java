class Bettery{
	String brand;
	float price;
	
	Bettery(String brand,float price){
		this.brand=brand;
		this.price=price;
	}
	String getDetail(){
		return brand +"\t"+ price;
	}
	String getBrand(){
		return brand;
	}
	float getPrice(){
		return price;
	}
}