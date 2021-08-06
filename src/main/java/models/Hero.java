package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String power, String weakness) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }
}
