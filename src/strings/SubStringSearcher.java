package strings;

/**
 * Имеются две строки. Найти количество вхождений одной (являющейся
 подстрокой) в другую.
 */

public class SubStringSearcher {

    public static void main(String[] args) {
        SubStringSearcher subStringSearcher = new SubStringSearcher();
        System.out.println(subStringSearcher.searcher("aaabbbaaa", "aa"));
    }

    public int searcher(String str, String substring) {
        int split;
        return split = str.split(substring,-1).length-1;
    }
}
