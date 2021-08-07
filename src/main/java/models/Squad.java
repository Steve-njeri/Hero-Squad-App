package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Squad {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<Hero> hero;
    private static List<Squad> squadInstances = new ArrayList<>();

    public Squad(String name, String cause, int size, ArrayList<Hero> hero) {
        this.name = name;
        this.cause = cause;
        this.maxSize = size;
        this.hero = hero;
        squadInstances.add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getCause() {
        return this.cause;
    }

    public int getSize() {
        return this.maxSize;
    }

    public ArrayList<Hero>  getHero() {
        return this.hero;
    }

    public static List<Squad> getSquadInstances() {
        return squadInstances;
    }

    public static Squad findById(int id) {
        try {
            return squadInstances.get(id-1);
        }catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

}
