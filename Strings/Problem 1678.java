public class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append('G');
                index++;
            } else if (command.charAt(index) == '(' && command.charAt(index + 1) == ')') {
                result.append('o');
                index += 2;
            } else {
                result.append("al");
                index += 4;
            }
        }
        return result.toString();
    }
}
