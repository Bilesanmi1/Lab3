package package1;
import java.util.Scanner;
public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNumber;
		int cube;
		int square;
		char choice = 'Y';
		
		
		while(choice != 'N') {
			System.out.println("Enter a number");
			userNumber = input.nextInt();
			System.out.println("Numbers\tSquared\tCubed\n");
			for(int i = 1; i <= userNumber; i ++) {
				cube = i * i* i;
				square = i * i ;
				System.out.printf("%d\t%d\t%d%n", i, square, cube);
				
			}
			System.out.println("Continue?(Y/N)");
			choice = input.next().charAt(0);
		}
		

	}
	
	
}
