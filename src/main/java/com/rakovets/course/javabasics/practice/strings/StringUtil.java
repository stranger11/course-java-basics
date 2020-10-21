package com.rakovets.course.javabasics.practice.strings;

import java.util.Arrays;

public class StringUtil {
    String getUpperCase(String string) {
        return string.toUpperCase();
    }

    String getConcat(String string, String string1) {
        return string.concat(string1);
    }

    int getIndexOf(String string, int ch) {
        int index = string.indexOf(ch);
        return index;
    }

    boolean getEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    String getTrim(String string) {
        return string.trim();
    }

    String getSubstring(String string, int numberSymbol) {
        return string.substring(numberSymbol);
    }

    String getReplace(String string, char oldChar, char newChar) {
        return string.replace(oldChar, newChar);
    }

    boolean getStartstWithAndEndsWith(String string, String str1) {
        return string.startsWith(str1) == string.endsWith(str1);
    }

    int getVowel(String string) {
        int x = 0;
        char symbol;
        for (int i = 0; i < string.length(); i++) {
            symbol = string.charAt(i);
            if (symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'a' || symbol == 'y') {
                x++;
            }
        }
        return x;
    }

    int getSymbol(String string) {
        int x = 0;
        char symbol;
        for (int i = 0; i < string.length(); i++) {
            symbol = string.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '!') {
                x++;
            }
        }
        return x;
    }

    boolean getReverse(String string) {
        String reverse = new StringBuffer(string).reverse().toString();
        return reverse.equals(string);
    }

    String getMassiv(String string, int x, int n) {
        String massiv[] = new String[x];
        int k = 0;
        for (int i = 0; i < string.length() - 1; i = i + n) {
            String q1 = string.substring(i, i + n);
            massiv[k++] = q1;
        }
        return Arrays.toString(massiv);
    }

    int getNumberOfWords(String string) {
        int count = 0;
        if (string.length() != 0) {
            count++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' && string.charAt(i) == ' ' + ' ') {
                    count++;
                }
            }

        }
        return count;
    }

    String getInizials(String str) {
        String[] tempArray = str.split(" ");
        String rezult = tempArray[0] + " ";
        for ( int i = 1; i < tempArray.length; i++) {
            rezult += tempArray[i].substring(0, 1).toUpperCase() + ". ";
        }
        return rezult.trim();


    }


}



