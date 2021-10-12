class Sum{
	//inside class for statement error: illegal start of type
	public static void main(String[] args){
		int sum = 0;
		byte[] numbers = {40,56,78,89,88,76,54,32,21,55,66};
		for(byte index = 0; index < numbers.length;index++){
			sum = sum + numbers[index];
		}
		System.out.println(sum);
		System.out.println(sum/numbers.length);
	}
}
