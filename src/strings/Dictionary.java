package strings;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 (опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст
 небольшой длины).
 Для чтения текста из файла можно использовать такую конструкцию:
 String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), "UTF-8");
 7. ** Реализуйте метод шифрования и дешифрования текста с помощью одиночной
 */

public class Dictionary {

    void buildDictionary(String text) {
    int[] result = new int ['я' - 'а'];
    text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <=  'я') {
                result[ch - 'а']++;
            }
        }
        }
}
