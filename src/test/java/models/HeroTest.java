package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void instantiatesHeroObjectsCorrectly_true() {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertTrue(myHero instanceof Hero);
    }

    @Test
    public void returnsHeroNameCorrectly_True()  {
        Hero myHero = new Hero ("stephen", 23, "work", "Pressure");
        assertEquals("stephen",myHero.getName());
    }
}