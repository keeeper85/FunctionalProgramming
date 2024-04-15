package org.example.lambdas;

import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.Queue;

public class ThreeHundredLambdasTest extends TestCase {

    public void testCastAoeSpell() {
        //given
        ThreeHundredLambdas.Spell spell = ThreeHundredLambdas.Spell.Implozja;
        Queue<ThreeHundredLambdas.UndeadSoldier> army = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            army.add(new ThreeHundredLambdas.UndeadSoldier());
        }
        int armySizeBefore = army.size();
        //when
        ThreeHundredLambdas.castAoeSpell(spell, army);
        int armySizeAfter = army.size();
        //then
        assertTrue(armySizeAfter <= armySizeBefore);
    }
}