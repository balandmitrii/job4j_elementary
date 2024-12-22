package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Александр Македонский";
        names[1] = "Фабий Максим";
        names[2] = "Сципион Африканский";
        names[3] = "Гораций Кокл";
        System.out.println("Names[0]: " + names[0]);
        System.out.println("Names[1]: " + names[1]);
        System.out.println("Names[2]: " + names[2]);
        System.out.println("Names[3]: " + names[3]);
    }
}
