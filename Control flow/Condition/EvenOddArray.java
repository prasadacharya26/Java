import java.util.Scanner;

class EvenOddArray{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number[] = {1,3,4,5,6,7};
		for(int i = 0;i<number.length;i++){
			if( number[i] % 2 == 0){
				System.out.println(number[i] + ":Even Number");
			} else{
				System.out.println(number[i] + ":Odd Number");
			}	
		}
	}
}