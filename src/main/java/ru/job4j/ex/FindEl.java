package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент в массиве не найден");
    }

    public static void main(String[] args) {
        try {
            String[] array = {"one", "two", "three"};
            String key = "one";
            int index = indexOf(array, key);
            System.out.println("Index of element: " + key + " in array" + index);
            key = "four";
            index = indexOf(array, key);
            System.out.println("Index of element: " + key + " in array" + index);
        } catch (ElementNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
