package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void createConditioner(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertFalse(conditioner.on);
        assertNull(conditioner.name);

    }

    @Test
    public void shouldNPE(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.name.length());

    }

    @Test
    public void changeTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        conditioner.currentTemperature = -100;
        assertEquals(-100, conditioner.currentTemperature);
    }
}