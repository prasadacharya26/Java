import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionProgram {
	static Scanner scanner=new Scanner(System.in);
	void stackOverflow(String name) {
		try {
			System.out.println(name);
			stackOverflow(name);
		}catch(StackOverflowError e) {
			System.err.println(e);
		}
		
	}
	void arrayIndexOutOfBounds(String[] name) {
		try {
			for(int i=0;i<=name.length;i++) {
				System.out.println(name[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		
	}
	void stringIndexOutOfBounds(String name,byte n){
		try {
			System.out.println("Length:"+name.length());
			System.out.println("Substring:"+name.substring(n));
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println(e);
		}
	}
	int inputMismatch(){
		int number=0;
		try {
			scanner.nextLine();
			System.out.println("Enter number:");
			number=scanner.nextInt();
		}catch(InputMismatchException e) {
			System.err.println(e);
		}
		return number;
	}
	void nullPointer(String str){
		try {
			if(str.equals("prasad")){
				System.out.println("prasad");
			}
		}catch(NullPointerException e) {
			System.err.println(e);
		}
	}
	int arithmeticException(byte a,byte b){
		int c=0;
		try {
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.err.println(e);
		}
		return c;
	}
	void numberFormatException(String name){
		try {
			int num = Integer.parseInt(name);
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.err.println(e);
		}
	}
	public static void main(String[] args) {
		String ans;
		do {
			System.out.println("1. StackOverflowError");
			System.out.println("2. ArrayIndexOutOfBoundsException");
			System.out.println("3. StringIndexOutOfBoundsException");
			System.out.println("4. InputMismatchException");
			System.out.println("5. NullPointerException");
			System.out.println("6. ArithmeticException");
			System.out.println("7. NumberFormatException");
			System.out.println("8. Exit");
			System.out.println("Enter your choice:");
			int ch = scanner.nextInt();
			if(ch==1) {
				ExceptionProgram ep=new ExceptionProgram();
				scanner.nextLine();
				System.out.print("Enter any name:");
				String name = scanner.nextLine();
				ep.stackOverflow(name);
			}
			else if(ch==2) {
				ExceptionProgram ep=new ExceptionProgram();
				scanner.nextLine();
				System.out.print("Enter size:");
				byte n=scanner.nextByte();
				String[] names=new String[n];
				System.out.print("Enter name:");
				for(int i=0;i<n;i++) {
					scanner.nextLine();
					names[i] = scanner.nextLine();
				}
				//String[] names={"a","b"};
				ep.arrayIndexOutOfBounds(names);
			}
			else if(ch==3) {
				ExceptionProgram ep=new ExceptionProgram();
				scanner.nextLine();
				System.out.print("Enter name:");
				String name = scanner.nextLine();
				System.out.print("Enter substring:");
				byte n=scanner.nextByte();
				ep.stringIndexOutOfBounds(name,n);
			}
			else if(ch==4){
				ExceptionProgram ep=new ExceptionProgram();
				ep.inputMismatch();
			}
			else if(ch==5){
				ExceptionProgram ep=new ExceptionProgram();
				String str = null;
				ep.nullPointer(str);
			}
			else if(ch==6){
				ExceptionProgram ep=new ExceptionProgram();
				System.out.print("Enter two number for division");
				System.out.print("Enter first number:");
				byte a=scanner.nextByte();
				System.out.print("Enter second number:");
				byte b=scanner.nextByte();
				ep.arithmeticException(a,b);
			}
			else if(ch==7){
				ExceptionProgram ep=new ExceptionProgram();
				scanner.nextLine();
				System.out.print("Enter name:");
				String name = scanner.nextLine();
				ep.numberFormatException(name);
			}
			else if(ch==8){
				break;
			}
			else{
				System.out.println("Enter valid number");
			}
			scanner.nextLine();
			System.out.println("\nDo you want continue type yes otherwise type anything");
			ans=scanner.next();
		}while(ans.equals("yes"));
	}
}
