import java.util.Stack;

public class ValidPare {
    static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                s1.push(s.charAt(i));
            } else {
                if (s1.size() == 0) return false;
                else if (s.charAt(i) == ')' && s1.peek() != '(') return false;
                else if (s.charAt(i) == '}' && s1.peek() != '{') return false;
                else if (s.charAt(i) == ']' && s1.peek() != '[') return false;
                else s1.pop();
            }
        }
        if (s1.size() != 0) return false;
        return true;
    }
}