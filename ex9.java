package Chapter2;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	float bodyweight,calories;
	System.out.print("Enter bodyweight:");
	bodyweight=sc.nextFloat();
	calories=bodyweight*19;
	System.out.print(calories+" Calories");
	}
}
