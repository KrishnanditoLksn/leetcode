class Solution {
    public static boolean isPalindrome(String s) {
        //Instantiate String builder class
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder();
        //iterating back from length of string - 1, decrement i
        for (int i = s.length() - 1; i >= 0; i--) {
            //break words into char
            //and then append it to string builder
            rev.append(s.charAt(i));
        }
        //comparing the original string with reversed word
        return rev.toString().equalsIgnoreCase(s);
    }
}