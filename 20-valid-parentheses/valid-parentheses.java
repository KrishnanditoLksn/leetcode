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
                char top = characterStack.peek();
                if (
                        (stackies == ')' && top != '(') ||
                                (stackies == ']' && top != '[') ||
                                (stackies == '}' && top != '{')) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }
}