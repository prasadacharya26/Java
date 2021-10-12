class RCB{
	static void players(){
		System.out.println("Virat Kohli");
		System.out.println("AB de Villiers");
		System.out.println("Devdutt Padikkal");
		System.out.println("Maxwell");
	}
	static void coach(String name){
		System.out.println("Coach:" + name);
	}
	static int won(int total){
		return total;
	}
	static int point(int total){
		int point = total * 2;
		return point;
	}
}