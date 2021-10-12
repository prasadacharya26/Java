class Tester{
	public static void main(String[] args){
		Car car = new Car();
		car.toDrive();
		car.toTravel();
		car.speed();
		System.out.println("---------------------");
		Gears gear =new Gears();
		Vechical vechical=new Vechical();
		gear.toSafety();
		vechical.toTravel();
	}
}