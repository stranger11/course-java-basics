package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

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

    public static String sortedNumbers(String string) {
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

    public static List<String> listText(String path) {
        String string = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                if (!string.equals("")) {
                    text += string + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Map<Character, Integer> charMap = new TreeMap<>();
        char ch = ' ';
        text = text.replace(" ", "");
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            ch = text.charAt(0);
            text = text.substring(1);
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else charMap.put(ch, 1);
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            list.add(entry.getKey() + "-" + entry.getValue());
        }

        return list;
    }

    public static List<String> wordsFrequency(String path) {
        String string = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                if (!string.equals("")) {
                    text += string + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Map<String, Integer> stringMap = new TreeMap<>();
        String[] wordsList = text.split(" +");
        for (String word : wordsList) {
            if (stringMap.containsKey(word)) {
                stringMap.put(word, stringMap.get(word) + 1);
            } else stringMap.put(word, 1);
        }
        int i = 0;
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            wordsList[i++] = entry.getValue() + "-" + entry.getKey();
        }
        String[] result = Arrays.copyOf(wordsList, i);
        Arrays.sort(result);
        list = Arrays.asList(result);
        return list;
    }


    public static List<String> sortNmbers(String path) {
        String string = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                if (!string.equals("")) {
                    text += string + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] stringNumbers = text.split(" +");
        int[] nums = new int[stringNumbers.length];
        for (int j = 0; j < stringNumbers.length; j++) {
            if (!stringNumbers[j].equals("")) {
                nums[j] = Integer.parseInt(stringNumbers[j]);
            }
        }
        Arrays.sort(nums);
        try (FileWriter writer = new FileWriter(path)) {
            for (int j = 0; j < stringNumbers.length; j++) {
                stringNumbers[j] = "" + nums[j];
                writer.write(stringNumbers[j] + System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        list.addAll(Arrays.asList(stringNumbers));
        return list;
    }

    public static double getProgress(String path) {
        String string = "";
        double sum = 0;
        int num = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                String[] data = string.split(",");
                for (String element : data) {
                    try {
                        sum += Double.parseDouble(element);
                        num++;
                    } catch (NumberFormatException e) {

                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new BigDecimal(sum/num).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }



}







