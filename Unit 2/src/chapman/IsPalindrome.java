/**
 * 
 */
package chapman;
import java.util.Scanner;

/**
 * IsPalindrome.java
 * April 18 2017
 * The program determines whether or not a word entered by the user is a palindrome
 * @author Roger Chapman
 */
public class IsPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a word");
		String yourWord = s.nextLine();
		if(isPalindrome(yourWord)){
			System.out.println("You entered a palindrome");
		}
		else{
			System.out.println("You did not enter a palindrome");
		}
	}
	/**
	 * The method compares one half of an entered word to the other half of that word to see if it is a palindrome
	 * @param word This is the word that is entered by the user
	 * @return true/false This depends on whether or not the word is a palindrome
	 */
	public static boolean isPalindrome(String word){
		for (int i=0; i < word.length()/2; i++){
			if (word.charAt(i) != word.charAt(word.length()-i-1)){
				return false;
			}
		}
		return true;
}
}


