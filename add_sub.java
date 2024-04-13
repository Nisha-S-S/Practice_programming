package DBWork;
import java.util.Scanner;


public class add_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		
		int add_answer = a + b;
		
		//add a code for subtraction
		int sub_answer = a - b;
		System.out.println("The addition of a and b is: "+add_answer);
		//add a code for subtraction statement
		System.out.println("The subtraction of a and b is : "+sub_answer);
		sc.close();
	}

}
