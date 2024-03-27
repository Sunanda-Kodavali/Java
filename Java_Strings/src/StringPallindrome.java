public class StringPallindrome {
    public static void main(String[] args) {
        String str = "Hannah";
        String reversedString = reverseString(str);
        if(isPalindrome(str, reversedString)){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }

    private static String reverseString(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }

    private static boolean isPalindrome(String str, String reversedString) {
        return str.equalsIgnoreCase(reversedString);
    }
}
