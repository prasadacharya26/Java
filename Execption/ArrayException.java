class ArrayException{
	public static void main(String []args){
		String []name = {"prasad","sanath","asif"};
		for(int i=0;i<=name.length;i++){
			try{
				System.out.println(name[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end main method");
	}
}