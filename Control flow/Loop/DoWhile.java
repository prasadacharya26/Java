import java.util.Scanner;

class DoWhile{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n;
		do{
			System.out.println("do you want countinue press 1:");
			n=scanner.nextInt();
		}while(n==1);
	}
}
