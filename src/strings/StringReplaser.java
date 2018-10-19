package strings;

public class StringReplaser {

    public static void main(String[] args) {
        StringReplaser stringReplaser = new StringReplaser();
        System.out.println(stringReplaser.replaser("Я встретил вас и влюбился", "влюбился", "censored"));
    }

    public String replaser(String text, String str, String censored) {
        String result = text;
        return result.replaceAll(str, censored);
    }
}
