public class Palindrome {
    /**
     * Checks if a string is a palindrome using stacks.
     * Ignores case, whitespace, and non-alphanumeric characters.
     *
     * @param s the string to test
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {

        String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        ArrayListStack<Character> stack1 = new ArrayListStack<>();
        ArrayListStack<Character> stack2 = new ArrayListStack<>();
        int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            stack1.push(normalized.charAt(i));
        }
        int startIndex = (length % 2 == 0) ? length / 2 : (length / 2) + 1;
        for (int i = startIndex; i < length; i++) {
            stack2.push(normalized.charAt(i));
        }
        while (!stack1.empty() && !stack2.empty()) {
            if (!stack1.pop().equals(stack2.pop())) {
                return false;
            }
        }

        return true;
    }
}
