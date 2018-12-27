package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    VowelsTest vowel = new VowelsTest();

    @Test
    public void removeVowels(String[] strings)
    {
        String[] result= vowel.removeVowels(new String[]{"India,United States, Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Ind,Untd Stts,Grmny,Egypt,czchslvk"},result);
    }

}