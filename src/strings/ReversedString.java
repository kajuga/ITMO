package strings;

/**
 * Напишите метод, который инвертирует слова в строке. Предполагается, что в
 строке нет знаков препинания, и слова разделены пробелами.
 This is a test string
 sihT si a tset gnirts
 */

public class ReversedString {

    public static void main(String[] args) {

        ReversedString reversedString = new ReversedString();
        System.out.println(reversedString.inverter("buffalo"));
    }

    public String inverter(String string) {
        char[] chars  = string.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }
}
