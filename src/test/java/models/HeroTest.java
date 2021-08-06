package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void instantiatesHeroObjectsCorrectly_true() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertTrue(true);
    }

    @Test
    public void returnsHeroNameCorrectly_True()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("stephen",myHero.getName());
    }

    @Test
    public void returnsHeroAgeCorrectly_True() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals(23,myHero.getAge());
    }

    @Test
    public void returnsHeroPowerCorrectly_True()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("work",myHero.getPower());
    }

    @Test
    public void returnsHeroWeaknessCorrectly_True() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("Pressure",myHero.getWeakness());
    }
}