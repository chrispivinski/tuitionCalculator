import java.util.Scanner;

public class TuitionCost {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		//Chris Pivinski Quiz 2
		System.out.println("Enter the tuition for your freshman year, e.g. 10000");
		double tuition = input.nextDouble();
		
		
		//converts tution increase to a amount to be implemented later in function
		//that is easier to use in the math e.g. 7% to 1.07
		
		System.out.println("Enter the yearly percentage increase of the tuition, e.g. 7");
		double tuitionIncreasePerYear = input.nextDouble();	
		double convertTuitionPercentEasierMath = (1 + (tuitionIncreasePerYear / 100));
		
		int years;
		double total = 0;
		
		for (years = 0; years < 4; years++) {
			total += (tuition * Math.pow(convertTuitionPercentEasierMath, years));
			}
		
		System.out.printf("Over the course of the four years to tuition, your total cost will be $%4.2f", total);
		
	}
}


