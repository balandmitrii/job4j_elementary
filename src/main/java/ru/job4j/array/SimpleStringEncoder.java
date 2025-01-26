package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        int counter = 1;

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);

            if (i + 1 < length && currentChar == input.charAt(i + 1)) {
                counter++;
            } else {
                result.append(currentChar);
                if (counter > 1) {
                    result.append(counter);
                }
                counter = 1;
            }
        }

        return result.toString();
    }
}