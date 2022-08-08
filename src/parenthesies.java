import java.util.LinkedList;

public class parenthesies {

    static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '{' || character == '(' || character == '[') {
                stack.addFirst(character);
            } else {
                if (stack.size() == 0)
                    return false;
                if (character == ')' && stack.pollFirst() != '(')
                    return false;
                else if (character == '}' && stack.pollFirst() != '{')
                    return false;
                else if (character == ']' && stack.pollFirst() != '[')
                    return false;

            }
        }
        if(stack.size() > 0)
            return false;


        return true;
    }
}
