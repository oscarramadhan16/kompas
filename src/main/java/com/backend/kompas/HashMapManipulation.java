package com.backend.kompas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapManipulation {
    public static HashMap<String, List<String>> manipulate(HashMap<String, String[]> data){
        HashMap<String, List<String>> newMap = new HashMap<>();
        var keys = data.keySet().toArray();
        for (int i=0; i<keys.length; i++) {
            var firstValue = data.get(keys[i]);
            for (int j=i+1; j<keys.length; j++) {
                var secondValue = data.get(keys[j]);
                List<String> concatValue = new ArrayList<>();
                for (int z=0; z<firstValue.length; z++) {
                    for (int y=0; y<secondValue.length; y++) {
                        //  check if have same value
                        if (firstValue[z].equals(secondValue[y])) {
                            concatValue.add(firstValue[z]);
                        }
                    }
                }
                newMap.put(keys[i] + "," + keys[j], concatValue);
            }
        }

        return newMap;
    }
}
