package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Котика зовут: " + this.name);
        System.out.println("Сегодня котик съел: " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String food) {
        this.food = food;
    }

    public String sound() {
        String voice = "myau-myau";
        return voice;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
