package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> arr = new ArrayList();
        for (Integer temp : array
             ) {
            if (temp % 2 == 0)
                arr.add(temp);
        }
        return arr;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> arr = new ArrayList();
        for (Integer temp : array
        ) {
            if (temp % 3 == 0)
                arr.add(temp);
        }
        return arr;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> arr = new ArrayList(firstList);
        arr.retainAll(secondList);
         return arr;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> arr = new ArrayList();
        HashSet<Integer> h = new HashSet(array);
        arr.addAll(h);
        return arr;
    }
}