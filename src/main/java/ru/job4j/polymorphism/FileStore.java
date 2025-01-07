package ru.job4j.polymorphism;

public class FileStore implements Store {
    private String path;

    public FileStore() { }

    public FileStore(String path) {
        this.path = path;
    }

    public void save(String data) {
        /* here will be saving */
    }

    public String read() {
        /* here will be reading file */
        return null;
    }
}