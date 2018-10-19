package strings;

import java.util.Arrays;
import java.util.Stack;

public class Polindrom {

    public static void main(String[] args) {
        Polindrom pl = new Polindrom();
        System.out.println("Результат: " + pl.polindrom("aaa"));
    }

    public boolean polindrom(String word) {
        boolean result = false;
        char[] strIncome = word.toCharArray();
        char[] strReversed = new char[strIncome.length];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < strIncome.length; i++) {
            stack.push(strIncome[i]);
        }

        for (int i = 0; i < strReversed.length; i++) {
            strReversed[i] = stack.pop();
        }

        if (Arrays.toString(strIncome).equals(Arrays.toString(strReversed))) {
            result = true;
        }
        return result;
    }
}
