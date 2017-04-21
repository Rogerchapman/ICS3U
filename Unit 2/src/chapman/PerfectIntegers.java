/**
 * 
 */
package chapman;

/**
 * PerfectIntegers.java
 * April 21 2017
 * The program determines all of the numbers between 1 and 100 that are equal to the sum of their factors except themselves. It then prints these values.
 * @author Roger Chapman
 *
 */
public class PerfectIntegers {

	public static void main(String[] args) {
		for (int x = 1; x <= 100; x++) {
			if (isPerfect(x) == true) {
				System.out.println(x);
			}
		}
	}
/**
 * The method checks if each number is equal to the sum of its factors except itself.
 * @param number This is the number that will be checked, basically every number from 1 to 100
 * @return true/ false This depends on whether or not the number is the sum of its factors except itself
 */
	public static boolean isPerfect(int number) {
		int sum = 0;
		for(int i = 1; i < number; i++){
			if(number %i == 0){
				sum = sum + i;
			}
		}
		if(sum == number){
			return true;
		}
		return false;
	}
}
