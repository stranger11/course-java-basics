package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {
    String sep = File.separator;
    String textString = "src" + sep + "main" + sep + "resources" + sep + "strings.txt";
    String wordsTask = "src" + sep + "main" + sep + "resources" + sep + "words.txt";
    String textNumbers = "src" + sep + "main" + sep + "resources" + sep + "numbers.txt";
    String docSortNumbers = "src" + sep + "main" + sep + "resources" + sep + "sortNumbers.txt";
    String docProgress = "src" + sep + "main" + sep + "resources" + sep + "progress.txt";

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

    @Test
    void Task5(){
        List<String> list = Arrays.asList("1 2 3", "67 68 69");
        Assertions.assertEquals(list, FileAnalyzeUtil.equalLetters(textNumbers, "numbers"));
    }

    @Test
    void Task6(){
        List<String> list = Arrays.asList("a-2", "e-2", "h-3", "j-1", "l-2", "n-1", "o-3", "v-1");
        Assertions.assertEquals(list, FileAnalyzeUtil.listText(textString));
    }

    @Test
    void Task7(){
        List<String> list = Arrays.asList("1-George", "1-Name", "1-Praha", "1-Yan", "1-born", "1-great", "1-in", "1-love", "1-name", "1-town!", "1-was", "2-Hello", "2-I", "2-Minsk", "2-My", "3-is");
        Assertions.assertEquals(list, FileAnalyzeUtil.wordsFrequency(wordsTask));
    }

    @Test
    void Task8() {
        List<String> list = Arrays.asList("11", "22", "32", "33", "45", "67");
        Assertions.assertEquals(list, FileAnalyzeUtil.sortNmbers(docSortNumbers));
    }

    @Test
    void Task9() {
        Assertions.assertEquals(6.83, FileAnalyzeUtil.getProgress(docProgress));
    }



}