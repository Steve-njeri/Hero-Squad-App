package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<Hero> hero;
    private static List<Squad> squadInstances = new ArrayList<>();
}
