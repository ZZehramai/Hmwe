package Chapter2;
import java.util.Scanner;
public class exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc=new Scanner(System.in);
		double centi,feet,inches,result;
		System.out.print("Enter centimeter:");
		centi=sc.nextDouble();
		inches=centi/2.54;
		feet=(int)inches/12;
		result=inches%12;
		System.out.print("The answer is "+feet+"feet"+result+"inches");
	}
}
