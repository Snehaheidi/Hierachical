import java.util.Scanner;
public class Hierachical {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Class_B b = new Class_B();
		Class_C c = new Class_C();
		System.out.println("The Class_B is Started...--> extends Class_A");
		System.out.println();
		b.Getdata(scanner);
		b.Sum();
		System.out.println();
		System.out.println("The Class_C is Started...--> extends Class_A");
		System.out.println();
		c.Getdata(scanner);
		c.Division();
		scanner.close();  
	}

}
