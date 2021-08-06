package models;

import java.util.ArrayList;
import java.util.Collection;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private static int id;

    public Hero(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id =instances.size();

    }

    public static void clearAllHero() {
        instances.clear();
    }

    public static Collection<Hero> getAllInstances() {
        return instances;
    }

    public static Hero findById(int i) {
        try {
            return instances.get(id-1);
        }catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static void setId(int id) {
        Hero.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPower() {
        return this.power;
    }

    public String getWeakness() {
        return this.weakness;
    }
}
