package Chapter2;
import java.util.Scanner;
public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in degree Celsius");
		double d1,d2;
		d1=sc.nextDouble();
		d2=1.8*d1+32;
		System.out.println("The temperature"+d2+" " +"in degree Fahrenheit");	
	}
}
