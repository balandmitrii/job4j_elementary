package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshmanVasya = new Freshman();
        Student student = freshmanVasya;
        Object student2 = student;
        Object objectFreshman = new Freshman();
        Freshman freshmanFromObject = (Freshman) objectFreshman;
        Student studentFromObject = (Student) objectFreshman;
    }
}
