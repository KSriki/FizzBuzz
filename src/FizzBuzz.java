/*
 * Classic FizzBuzz Interview Question
 * Srikant Kumar Kalaputapu
 * June 20, 2017
 */
public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++){

			// Every 3rd FizzBuzz
			if (i % 45 == 0){
				System.out.println("Bam!");
			}
			// Every 4th Buzz
			else if (i % 20 == 0){
				System.out.println("Buzzy!");
			}
			// Multiples of 3 and 5
			else if(i % 15 == 0){
				System.out.println("FizzBuzz");
			}
			// Every 3rd Fizz
			else if(i % 9 == 0){
				System.out.println("Fizzy!");
			}
			// Multiples of 5
			else if(i % 5 == 0){
				System.out.println("Buzz");
			}
			// Multiples of 3
			else if(i % 3 == 0){
				System.out.println("Fizz");
			}
			// Otherwise print number
			else{
				System.out.println(i);
			}
			
		}
		
	}
	
}
