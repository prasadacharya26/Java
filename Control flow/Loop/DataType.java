import java.util.Scanner;

class DataType{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = scanner.nextLine();
		System.out.println("Enter byte value:");
		byte b = scanner.nextByte();
		System.out.println("Enter short value:");
		short s = scanner.nextShort();
		System.out.println("Enter integer value:");
		int i = scanner.nextInt();
		System.out.println("Enter long value:");
		long l = scanner.nextLong();
		System.out.println("Enter float value:");
		float f = scanner.nextFloat();
		System.out.println("Enter double value:");
		double d = scanner.nextDouble();
		System.out.println("Enter character:");
		char c = scanner.next().charAt(0);
		System.out.println("Enter Boolean:");
		boolean bool = scanner.nextBoolean();
		System.out.println("String:"+ str);
		System.out.println("Byte:"+ b);
		System.out.println("Short:"+ s);
		System.out.println("Integer:"+ i);
		System.out.println("long:"+ l);
		System.out.println("Float:"+ f);
		System.out.println("Double:"+ d);
		System.out.println("Char:"+ c);
		System.out.println("Boolean:"+ bool);
	}
}