package tuto;
import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		
		System.out.println("This is my first java program ");
		
		int a=15,b=16,c,d;
		c=a+b;
		System.out.println(c);
		System.out.println("enter the value of c ");
		Scanner o=new Scanner(System.in);
		c=o.nextInt();
		d=a+b+c;
		System.out.println(d);
		
	}

}
