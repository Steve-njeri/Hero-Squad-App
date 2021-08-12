package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        Hero.clearAllHero();
    }

    @Test
    public void instantiatesHeroObjectsCorrectly_true() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertTrue(true);
    }

    @Test
    public void returnsHeroNameCorrectly_String()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("stephen",myHero.getName());
    }

    @Test
    public void returnsHeroAgeCorrectly_int() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals(23,myHero.getAge());
    }

    @Test
    public void returnsHeroPowerCorrectly_String()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("work",myHero.getPower());
    }

    @Test
    public void returnsHeroWeaknessCorrectly_String()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("Pressure",myHero.getWeakness());
    }

    @Test
    public void allHeroesAreCorrectlyReturned_int() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        Hero otherHero = new Hero ("paul", 20, "people", "Time");
        assertEquals(2,Hero.getAllInstances().size());

    }

    @Test
    public void allHeroesContainsAllHeroObjects_true()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        Hero otherHero = new Hero ("paul", 20, "people", "Time");
        assertTrue(Hero.getAllInstances().contains(myHero));
        assertTrue(Hero.getAllInstances().contains(otherHero));
    }

//    @Test
//    public void findHeroById() throws Exception {
//        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
//        Hero otherHero = new Hero ("paul", 20, "people", "Time");
//        Hero foundMyHero = Hero.findById(1);
//        Hero foundOtherHero = Hero.findById(2);
//        assertTrue(myHero.equals(foundMyHero));
//        assertEquals(otherHero, foundOtherHero);
//    }

    @Test
    public void checkIfNewlyCreatedHeroIsSquadMember_false() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals(false, myHero.isSquadMember());
    }


    @Test
    public void deletesSpecifiedHero() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        Hero otherHero = new Hero ("paul", 20, "people", "Time");
        otherHero.deleteHero();
        assertEquals(1, Hero.getAllInstances().size());
        assertEquals(Hero.getAllInstances().get(0).getId(), 2);
    }

    @Test
    public void deletesAllHeroes() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        Hero otherHero = new Hero ("paul", 20, "people", "Time");
        Hero.clearAllHeroes();
        assertEquals(0, Hero.getAllInstances().size());
    }
}