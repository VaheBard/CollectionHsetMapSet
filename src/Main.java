import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> lettersAmount = new HashMap<>();

        textToCharAddMap(lettersAmount);//Экстрактировал, логику сливание символов в мапу, в этот метод

        for (Map.Entry<Character, Integer> kv : lettersAmount.entrySet()) {//вывожу заполненную мапу на экран для наглядности в формате
            System.out.println(kv.getKey() + " = " + kv.getValue() + "\n");// ключ = значение, где ключ это буква из текста а значение то количество
                                                                    // сколько раз она повторялась в тексте
        }

        letterMinMax(lettersAmount);//этот метод считает минимальное и максимальное количество символов в тексте, и результат выводит на экран
    }

    private static void textToCharAddMap(Map<Character, Integer> lettersAmount) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            if (Character.isLetter(c) && !lettersAmount.containsKey(c)) {
                lettersAmount.put(c, count);
            } else if (Character.isLetter(c)) {
                lettersAmount.put(c, count++);
            }
        }
    }

    private static void letterMinMax(Map<Character, Integer> letters) {
        int maxValue = 0;
        char maxLetter = 0;
        int minValue;
        char minLetter = 0;

        for (char key : letters.keySet()) {
            int value = letters.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxLetter = key;
            }
        }

        minValue = maxValue;
        for (char key : letters.keySet()) {
            int value = letters.get(key);
            if (value < minValue) {
                minValue = value;
                minLetter = key;
            }
        }
        System.out.println("Максимальное количество раз встречается буква : " + maxLetter + " = " + maxValue +"\n");
        System.out.println("Минимальное количество раз встречается буква : " + minLetter + " = " + minValue + '\n');
    }

    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" +
            " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" +
            " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
            "culpa qui officia deserunt mollit anim id est laborum.";
}

