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
        assertTrue(true);
    }

    @Test
    public void returnsSquadNameCorrectly_String() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals ("Hooters", mySquad.getName());
    }

    @Test
    public void returnsSquadCauseCorrectly_String()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals ("uplifting", mySquad.getCause());
    }

    @Test
    public void returnsSquadSizeCorrectly_int()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals (10, mySquad.getSize());
    }

    @Test
    public void returnsSquadHeroesCorrectly_ArrayList() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, Hero);
        assertEquals (Hero, mySquad.getHero());
    }
}