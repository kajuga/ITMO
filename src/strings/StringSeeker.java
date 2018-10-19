package strings;

public class StringSeeker {


    public static void main(String[] args) {
        String[] strings = {"sss", "dddd", "fffff", "aa"};
        System.out.println(new StringSeeker().longest(strings));
    }

    public String longest(String[] str) {
        String max = str[0];

        if (str != null) {
            for (int i = 0; i < str.length; i++) {
                if (max.length() < str[i].length()) {
                    max = str[i];
                }
            }
        }
        return max;
    }
}


