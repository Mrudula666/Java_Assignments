package corejava.assignments_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void palindromeTestForPositiveNumbers() {
		int number = 121;//taking the integer
		boolean palindrome = Palindrome.isPalindrome(number);//calling the palindrome() method.
		assertTrue(palindrome);//checking whether the number is palindrome or not
	}
	@Test
	public void palindromeTestForNegativeNumbers() {
		int number = -121;//taking the integer
		boolean palindrome = Palindrome.isPalindrome(number);//calling the palindrome() method.
		assertTrue(palindrome);//checking whether the number is palindrome or not
	}
	@Test
	public void palindromeTestForTwoDigits() {
		int number = 10;//taking the integer
		boolean palindrome = Palindrome.isPalindrome(number);//calling the palindrome() method.
		assertTrue(palindrome);//checking whether the number is palindrome or not
	}
}
