package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNumere {
    @Test
    public void isCharacterPresent() {

        boolean rez = Main.isCharacterPresent("Ana are mere", 'n');
        assertTrue(rez);


    }

    @Test
    public void isNotCharacterPresent() {

        boolean rez = Main.isCharacterPresent("Ana are mere", 'p');
        assertTrue(rez);
    }
    @Test
    public void stringIsPalindrom(){
        boolean rez = Main.isStringPalindrom("ana");
        assertTrue(rez);
    }
    @Test
    public void stringIsNotPalindrom(){
        boolean rez = Main.isStringPalindrom("maria");
        assertFalse(rez);
    }
    @Test
    public void stringIsPalindrom2(){
        boolean rez = Main.isStringPalindrom("Ana");
        assertTrue(rez);
    }
    @Test
    public void verificareGrade(){
        int rez = Main.schimbareGrade(12);
        assertEquals(53, rez);
    }
}
