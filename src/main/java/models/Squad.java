package models;

import java.util.ArrayList;
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
    }

    public String getName() {
        return this.name;
    }

    public String getCause() {
        return this.cause;
    }
}
