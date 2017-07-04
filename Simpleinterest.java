package sumave1;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		float p,n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal");
		p=sc.nextFloat();
		System.out.println("enter the rate of interest");
		r=sc.nextFloat();
		System.out.println("enter the time period");
		n=sc.nextFloat();
		float si;
		si=(p*n*r)/100;
		System.out.println("the simple interest is:"+si);
		

	}

}
