class Solution {
    public boolean isValid(String s) {
           Stack<Character> characterStack = new Stack<>();
        for (char stackies : s.toCharArray()) {
            if (stackies == '(' || stackies == '[' || stackies == '{') {
                characterStack.push(stackies);
            } else {
                if (characterStack.isEmpty()) {
                    System.out.println("Stack kosong");
                    return false;
                }
                if (
                        (stackies == ')' && characterStack.peek() != '(') ||
                                (stackies == ']' && characterStack.peek() != '[') ||
                                (stackies == '}' && characterStack.peek() != '{')) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }
}