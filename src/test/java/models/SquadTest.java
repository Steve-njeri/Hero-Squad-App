package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SquadTest {

    private ArrayList<Hero> Hero;

    @Test
    public void instantiatesSquadObjectsWithHeroObjectsCorrectly_true() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals (true, mySquad instanceof Squad);
    }

    @Test
    public void returnsSquadNameCorrectly_true() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals ("Hooters", mySquad.getName());
    }

    @Test
    public void returnsSquadCauseCorrectly_true()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals ("uplifting", mySquad.getCause());
    }

    @Test
    public void returnsSquadSizeCorrectly_true()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals (10, mySquad.getSize());
    }
}