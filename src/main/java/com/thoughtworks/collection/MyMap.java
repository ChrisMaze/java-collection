package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> arr = new ArrayList();
        for (Integer temp : array
             ) {
            arr.add(temp*3);
        }
        return arr;
    }

    public List<String> mapLetter() {
        List<String> arr = new ArrayList();
        for (Integer temp : array) {
            arr.add(letters[temp-1]);
        }
        return arr;
    }

    public List<String> mapLetters() {
        String[] str = new String[array.size()+1];
        List<String> arr = new ArrayList();
        int i = 0;
        for (Integer temp : array) {
            if (temp > 26)
            {
                str[i++] = letters[(temp-1)/26 -1] + letters[(temp-1)%26];
            }else
            {
                str[i++] = letters[temp-1];
            }
        }
        for (int j = 0; j <array.size() ; j++) {
            arr.add(str[j]);
        }

        return arr;
    }

    public List<Integer> sortFromBig() {
       List<Integer> arr = new ArrayList(array);
       arr.sort(null);
       Collections.reverse(arr);
       return arr;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> arr = new ArrayList(array);
        arr.sort(null);
        return  arr;
    }
}
