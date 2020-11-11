package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileAnalyzeUtil {
    public static ArrayList<String> getListStringOfFile(String text) {
        String word = "";
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            while ((word = br.readLine()) != null) {
                list.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static ArrayList<String> getWordsStartWithVowel(String text) {
        String word = "";
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            while ((word = br.readLine()) != null) {
                if (word.matches("^[aeiouyAEIOUY].*"))
                    list.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<String> equalLetters(String text) {
        String word = "";
        ArrayList<String> list = new ArrayList<>();
        String nextWord = "";
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            while ((word = br.readLine()) != null) {
                if (!nextWord.equals("")) {
                    if (nextWord.charAt(nextWord.length() - 1) == word.charAt(0)) {
                        list.add(nextWord);
                        list.add(word);
                    }
                }
                nextWord = word;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}