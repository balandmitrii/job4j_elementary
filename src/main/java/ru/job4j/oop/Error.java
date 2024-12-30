package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.showInfo();
        System.out.println();
        Error error2 = new Error(true, 200, "Everything is good");
        error2.showInfo();
        System.out.println();
        Error error3 = new Error(false, 403, "Go out!");
        error3.showInfo();
    }
}
