package Level_2;
class PalindromeChecker {
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
}

// Main class to execute the program
public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("kumar");
        PalindromeChecker checker2 = new PalindromeChecker("Rithik");
        PalindromeChecker checker3 = new PalindromeChecker("Hello");

        checker1.displayResult();
        checker2.displayResult();
        checker3.displayResult();
    }
}
