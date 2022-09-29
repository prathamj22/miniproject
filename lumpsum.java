import java.util.*;
public class lumpsum{

	public static void main(String[] args){

		double returns, final_val;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter amount invested : ");
		double invested = sc.nextDouble();
		System.out.print("Enter time period (in years) : ");
		double time = sc.nextDouble();
		System.out.print("Enter rate of interest : ");
		double rate = sc.nextDouble();
		returns= invested *(Math.pow((1 + rate / 100), time)); 
        final_val= returns;
		System.out.println("Returns will be "+final_val);

	}
}
