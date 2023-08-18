package Chapter2;
import java.util.Scanner;
public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double fahrenheit,celsius;
		System.out.println("Enter degrees in Fahrenheit:");
		fahrenheit=sc.nextDouble();
		celsius=5/9*(fahrenheit-32);
		System.out.print(celsius+"Degrees in Celsius:");
	}

}
