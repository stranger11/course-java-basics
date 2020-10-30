package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.map.wordsmonitoring.WordsMonitoring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WordsMonitoringTest {

    @Test
    void test1() {
        String text = "Java is the best language of programming";
        WordsMonitoring wordsMonitoring = new WordsMonitoring();
        wordsMonitoring.researchText(text);
        assertEquals(7, wordsMonitoring.getCountUniqueWords());
        assertEquals("[the, Java, of, is, best, language, programming]", wordsMonitoring.getUniqueWords().toString());
        assertEquals(1, wordsMonitoring.get("best"));
        assertEquals(1, wordsMonitoring.get("of"));
        assertEquals(1, wordsMonitoring.get("the"));
        assertEquals("{the=1, Java=1, of=1, is=1, best=1, language=1, programming=1}", wordsMonitoring.getWordFrequencyDesc(true).toString());
        assertEquals("{the=1, Java=1, of=1, is=1, best=1, language=1, programming=1}", wordsMonitoring.getWordFrequencyDesc(false).toString());
    }
}

