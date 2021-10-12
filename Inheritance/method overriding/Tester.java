class Tester{
	public static void main(String[] args){
		
		//upcast
		AutoMobile auto = new Car();
		auto.getCompany();
	
		AutoMobile mobile=new Vechical();
		mobile.getCompany();
		System.out.println("-------------------------------");
		
		//downcast
		Car car = (Car)auto;
		car.getCompany();
		Vechical vechical =(Vechical)mobile;
		vechical.getCompany();
	}
}