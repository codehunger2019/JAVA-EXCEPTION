
package exceptionHandling;
import java.util.Scanner;
public class WebPage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number");
		int fn=scan.nextInt();
		
		System.out.println("Enter Second Number");
		int sn=scan.nextInt();
		
		scan.close();
		
		Calculator c=new Calculator();
		c.divide(fn, sn);
	}
}
