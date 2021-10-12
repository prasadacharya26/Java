class Tester{
	public static void main(String[] args){
		Bettery bettery=new Bettery("abc",4555f);
		Mobile mobile=new Mobile("xyz","ddd",(byte)6,bettery);
		mobile.getDetails();
	}
}