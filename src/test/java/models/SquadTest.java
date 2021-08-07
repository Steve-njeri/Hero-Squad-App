package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void instantiatesSquadObjectsWithHeroObjectsCorrectly_true() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        assertTrue(true);
    }

    @Test
    public void returnsSquadNameCorrectly_String() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        assertEquals ("Hooters", mySquad.getName());
    }

    @Test
    public void returnsSquadCauseCorrectly_String()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        assertEquals ("uplifting", mySquad.getCause());
    }

    @Test
    public void returnsSquadSizeCorrectly_int()  {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        assertEquals (10, mySquad.getSize());
    }

    @Test
    public void returnsSquadHeroesCorrectly_ArrayList() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        assertEquals (hero, mySquad.getHero());
    }

    @Test
    public void returnsAllSquadInstancesCorrectly_int() {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        Squad secondSquad = new Squad("Geeks", "Java literacy", 5, hero );
        Squad thirdSquad = new Squad("Gamblers", "Poverty", 8, hero );
        assertEquals(3, Squad.getSquadInstances().size());
    }

    @Test
    public void squadsContainsAllSquadObjects_true(){
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        Squad secondSquad = new Squad("Geeks", "Java literacy", 5, hero );
        Squad thirdSquad = new Squad("Gamblers", "Poverty", 8, hero );
        assertTrue(Squad.getSquadInstances().contains(mySquad));
        assertTrue(Squad.getSquadInstances().contains(secondSquad));
        assertTrue(Squad.getSquadInstances().contains(thirdSquad));
    }

    @Test
    public void findSquadById() throws Exception {
        ArrayList<Hero> hero = new ArrayList<>();
        Squad mySquad = new Squad ("Hooters", "uplifting", 10, hero);
        Squad secondSquad = new Squad("Geeks", "Java literacy", 5, hero );
        Squad thirdSquad = new Squad("Gamblers", "Poverty", 8, hero );
        Squad foundMySquad = Squad.findById(1);
        Squad foundSecondSquad = Squad.findById(2);
        Squad foundThirdSquad = Squad.findById(3);
        assertEquals(mySquad, foundMySquad);
        assertEquals(secondSquad,foundSecondSquad);
        assertEquals(thirdSquad , foundThirdSquad);

    }
}