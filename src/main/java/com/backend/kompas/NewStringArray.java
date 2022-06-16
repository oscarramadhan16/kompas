package com.backend.kompas;

import java.util.ArrayList;
import java.util.List;

public class NewStringArray {
    public static List<String> newStringArray(List<String> array) {
        List<String> newList = new ArrayList<>();
        boolean skipLast = false;
        for (int i=0; i<array.size()-1; i++) {
            String concat = array.get(i).concat(" "+array.get(i+1));
            //  check here if the concat string length still in rule
            if (concat.length()-1 > 0 && concat.length()-1 <= 11) {
                newList.add(concat);
                if (array.size()-1 == i+1) {
                    //  add flag here for last data already included in process here
                    skipLast = true;
                }
                i++;
            } else {
                //  if not, add the existing value to new array list
                newList.add(array.get(i));
            }
        }

        //  check if last
        if (!newList.contains(array.get(array.size()-1)) && !skipLast) {
            newList.add(array.get(array.size()-1));
        }

        return newList;
    }
}
