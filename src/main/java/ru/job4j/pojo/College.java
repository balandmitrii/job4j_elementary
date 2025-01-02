package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Михайло Ломоносов");
        student.setDateReceipt(LocalDate.now());
        student.setGroup("Алхимия");
        System.out.println("Студент " + student.getFio() + " начал обучение " + student.getDateReceipt() + " в группе " + student.getGroup());
    }
}
