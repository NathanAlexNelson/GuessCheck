	import java.util.Scanner;

	public class GuessCheck {
	    public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int Y = 0;
			while (Y <= 2){		        
			int computerNum;
			String response;
			computerNum = 0 + (int) (Math.random() * 10);
			System.out.println("The answer is " + computerNum);
		

			System.out.println("What number 0 - 10 are you guessing?");


			int X = input.nextInt();
			
			
		if ((X >= 0)&&(X <= 10)) {
			
			if (X == computerNum) {
			System.out.println("Your number is correct!");
			}

			else {
				response=(X>computerNum)?"Your number is too high.":"Your number is too low.";
				System.out.printf(response);
				}
			}

			else {
			System.out.println("You did not guess a valid number.");
			}
			
			Y++;
			}
			input.close();
	    }
	}