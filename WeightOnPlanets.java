import java.util.*;
public class WeightOnPlanets {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter your weight. ");
		double wght=kb.nextDouble();
		System.out.println("1. Volatar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		System.out.print("Selection? ");
		Scanner kb2=new Scanner(System.in);
		int select=kb2.nextInt();
		
		double wght1 = wght * 0.091;
		double wght2 = wght * 0.720;
		double wght3 = wght * 0.865;
		double wght4 = wght * 4.612;
		
		
		
		switch(select){
		case 1:
			System.out.println("Your weight on Volatar is " + wght1 +" pounds.");
			break;
		case 2:
			System.out.println("Your weight on Krypton is " + wght2 +" pounds.");
			break;
		case 3:
			System.out.println("Your weight on Fertos is " + wght3 +" pounds.");
			break;
		case 4:
			System.out.println("Your weight on Servontos is " + wght4 +" pounds.");
			break;
			
		}
	

	}

}
