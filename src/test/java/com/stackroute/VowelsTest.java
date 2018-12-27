package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    Vowels vowel = new Vowels();

    @Test
    public void removeVowels()
    {
        String[] result= vowel.vowelRemover(new String[]{"India,United States, Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Ind,Untd Stts,Grmny,Egypt,czchslvk"},result);
    }

}