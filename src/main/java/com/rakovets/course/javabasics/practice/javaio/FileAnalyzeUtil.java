package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static ArrayList<String> equalLetters(String text, String condition) {
        String word = "";
        ArrayList<String> list = new ArrayList<>();
        String nextWord = "";
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            while ((word = br.readLine()) != null) {
                switch (condition) {
                    case "equalLetters1":
                        if (!nextWord.equals("")) {
                        if (nextWord.charAt(nextWord.length() - 1) == word.charAt(0)) {
                            list.add(nextWord);
                            list.add(word);
                        }
                    }
                    nextWord = word;
                        break;
                    case "numbers":
                        list.add(sortedNumbers(word));
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String sortedNumbers (String string) {
        List<String> list = Arrays.asList(string.split(" +"));
        List<Integer> numbersList = new ArrayList<>();
        for (String str : list)
            numbersList.add(Integer.parseInt(str));
        List<List<Integer>> listOfNumbersList = new ArrayList<>();
        int fromIndex = 0;
        if (list.size() > 1) {
            for (int i = 1; i < numbersList.size(); i++) {
                if (numbersList.get(i - 1) >= numbersList.get(i)) {
                    listOfNumbersList.add(numbersList.subList(fromIndex, i));
                    fromIndex = i;
                }
            }
            listOfNumbersList.add(numbersList.subList(fromIndex, numbersList.size()));
        } else return list.get(0);
        int size = listOfNumbersList.get(0).size();
        int max = size;
        int index = 0;
        for (int i = 1; i < listOfNumbersList.size(); i++) {
            size = listOfNumbersList.get(i).size();
            if (max < size) {
                max = size;
                index = i;
            }
        }
        String result = "";
        for (Integer num : listOfNumbersList.get(index)) {
            result += num + " ";
        }
        return result.trim();
    }

}