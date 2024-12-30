package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                System.out.println("Пешеходы по лужам");
                System.out.println("А вода по асфальту рекой");
                break;
            case 2:
                System.out.println("Спят усталые игрушки, книжки спят");
                System.out.println("Одеяла и подушки ждут ребят");
                break;
            default: System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        System.out.println();
        jukebox.music(2);
        System.out.println();
        jukebox.music(3);
    }
}
