class RCB{
	static int point(int won){
		System.out.println(won);
		return 2*point(won);
	}
}