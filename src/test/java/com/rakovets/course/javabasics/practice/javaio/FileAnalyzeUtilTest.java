package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {
    String sep = File.separator;
    String textString = "src" + sep + "main" + sep + "resources" + sep + "strings.txt";
    //String textNumbers = "src" + sep + "main" + sep + "resources" + sep + "numbers.txt";

    @Test
    void Task2(){
        List<String> list = Arrays.asList("HELLO", "JAVA", "NEO", "OHH");
        Assertions.assertEquals(list, FileAnalyzeUtil.getListStringOfFile(textString));
    }


    @Test
    void Task3(){
        List<String> list = Arrays.asList("OHH");
        Assertions.assertEquals(list, FileAnalyzeUtil.getWordsStartWithVowel(textString));
    }

    @Test
    void Task4(){
        List<String> list = Arrays.asList("NEO", "OHH");
        Assertions.assertEquals(list, FileAnalyzeUtil.equalLetters(textString, "equalLetters1"));
    }


    String textNumbers = "src" + sep + "main" + sep + "resources" + sep + "numbers.txt";
    @Test
    void Task5(){
        List<String> list = Arrays.asList("1 2 3", "67 68 69");
        Assertions.assertEquals(list, FileAnalyzeUtil.equalLetters(textNumbers, "numbers"));
    }

}