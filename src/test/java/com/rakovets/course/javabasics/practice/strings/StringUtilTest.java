package com.rakovets.course.javabasics.practice.strings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void getUpperCaseTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCase("qwerty"));
        Assertions.assertEquals("Q1ERTY", stringUtil.getUpperCase("q1erty"));
        Assertions.assertEquals("HELLO", stringUtil.getUpperCase("hello"));
    }

    @Test
    void getConcatTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("YuiopOut", stringUtil.getConcat("Yuiop", "Out"));
        Assertions.assertEquals("HelloWorld", stringUtil.getConcat("Hello", "World"));
        Assertions.assertEquals("WARHAMMER40000", stringUtil.getConcat("WARHAMMER", "40000"));
    }

    @Test
    void  getIndexOfTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(-1, stringUtil.getIndexOf("Hello", 'x'));
        Assertions.assertEquals(3, stringUtil.getIndexOf("xrty", 'y'));
        Assertions.assertEquals(0, stringUtil.getIndexOf("sdsds",'s'));
    }

    @Test
    void getEqualsTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(true, stringUtil.getEquals("qwerty", "qwerty"));
        Assertions.assertEquals(false, stringUtil.getEquals("qwerty", "tyuio"));
        Assertions.assertEquals(false, stringUtil.getEquals("QWERTY", "qwerty"));
    }

    @Test
    void getTrim() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("ABC", stringUtil.getTrim(" ABC "));
        Assertions.assertEquals("ABC", stringUtil.getTrim("  ABC  "));
    }

    @Test
    void getSubString() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("e best", stringUtil.getSubstring("Java is the best", 10));
        Assertions.assertEquals("ABCD", stringUtil.getSubstring("QWERTYABCD", 6));
        Assertions.assertEquals("country", stringUtil.getSubstring("Belarus is the best country", 20));
    }

    @Test
    void getReplace() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("ABCD", stringUtil.getReplace("ABCF", 'F', 'D'));
        Assertions.assertEquals("Good day :)", stringUtil.getReplace("Good day :(", '(', ')'));
        Assertions.assertEquals("Happy new 2020 year", stringUtil.getReplace("Happy new 2021 year", '1', '0'));
    }

    @Test
    void getStartstWithAndEndsWith() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(false, stringUtil.getStartstWithAndEndsWith("word is all", "word"));
        Assertions.assertEquals(true, stringUtil.getStartstWithAndEndsWith("word is another word", "word"));
        Assertions.assertEquals(false, stringUtil.getStartstWithAndEndsWith("string is bad", "string"));
        Assertions.assertEquals(true, stringUtil.getStartstWithAndEndsWith("string is very good string", "string"));
    }


    @Test
    void getVowel() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(3, stringUtil.getVowel("hellou") );
        Assertions.assertEquals(1, stringUtil.getVowel("hal"));
        Assertions.assertEquals(0, stringUtil.getVowel("bcd"));
    }


    @Test
    void  getSymbol() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(2, stringUtil.getSymbol("Hello, dad!"));
        Assertions.assertEquals(3, stringUtil.getSymbol("Hello, Dad. You are busy!"));
        Assertions.assertEquals(0, stringUtil.getSymbol("hello"));
    }


    @Test
    void getReverse() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(false, stringUtil.getReverse("fdrg"));
        Assertions.assertEquals(true, stringUtil.getReverse("abba"));
        Assertions.assertEquals(true, stringUtil.getReverse("adbda"));
    }

    @Test
    void getMassiv() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals( "[12, 34, 56]", stringUtil.getMassiv("123456", 3, 2) );
        Assertions.assertEquals("[abc, dff, dqq]", stringUtil.getMassiv("abcdffdqq", 3, 3));
        Assertions.assertEquals("[1111, 2222, 3333, 4444]", stringUtil.getMassiv("1111222233334444", 4, 4));
    }

    @Test
    void getNumberOfWords() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(2, stringUtil.getNumberOfWords("Hello world"));
        Assertions.assertEquals(4, stringUtil.getNumberOfWords("My name is Jake"));
        Assertions.assertEquals(2, stringUtil.getNumberOfWords("Tom friend"));
    }


    @Test
    void getInizials() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("P Y U", stringUtil.getInizials("Pashyk Yan Urich"));
    }
}
