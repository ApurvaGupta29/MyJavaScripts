package JAVA24;

public class NumberisPalindrome {

	
		    public static boolean isPalindrome(int number) {
		        // Convert the number to a string
		        String str = Integer.toString(number);
		        // Get the length of the string
		        int len = str.length();
		        
		        // Compare the string with its reverse
		        for (int i = 0; i < len / 2; i++) {
		            if (str.charAt(i) != str.charAt(len - i - 1)) {
		                return false;  // Not a palindrome
		            }
		        }
		        return true;  // Is a palindrome
		    }

		    public static void main(String[] args) {
		        int number = 121;
		        if (isPalindrome(number)) {
		            System.out.println(number + " is a palindrome.");
		        } else {
		            System.out.println(number + " is not a palindrome.");
		        }
		    }
		

	}

