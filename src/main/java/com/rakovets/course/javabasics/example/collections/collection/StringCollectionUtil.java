package com.rakovets.course.javabasics.example.collections.collection;

import java.util.ArrayList;
import java.util.Collection;


public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> list, int length) {
        Collection<String> newlist = new ArrayList<String>();
        String change = "*";
        for (String str : list) {
            String result = str.length() == length ? change : str;
            newlist.add(result);
        }

        return newlist;


    }



    public Collection<String> removeWordsByLength(Collection<String> list, int length) {
        Collection<String> newList = new ArrayList<String>();
        for (String str : list) {
            if (str.length() != length) {
                newList.add(str);
            }
        }
        return newList;
    }
}

