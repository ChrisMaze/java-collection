package com.thoughtworks.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int i,j;
        List<Integer> arr = new ArrayList();
        i = (left<=right) ? left : right;
        j =  (left<=right) ? right : left;
        for (; i <= j; i++) {
            arr.add(i);
        }
        if (left > right)
            Collections.reverse(arr);
        return arr;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int i,j;
        List<Integer> arr = new ArrayList();
        i = (left<=right) ? left : right;
        j = (left<=right) ? right : left;
        i = (i % 2 == 0) ? i : i+1;
        j = (j % 2 == 0) ? j : j-1;
        for (; i <= j; i = i+2) {
            arr.add(i);
        }
        if (left > right)
            Collections.reverse(arr);
        return arr;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> arr = new ArrayList();
        for (Integer temp : arrayList) {
            if (temp % 2 == 0)
                arr.add(temp);
        }
        return arr;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstArrayList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondArrayList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        firstArrayList.retainAll(secondArrayList);
        return  firstArrayList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
       List<Integer> firstArrayList = Arrays.asList(firstArray);
       List<Integer> secondArrayList = Arrays.asList(secondArray);
       List<Integer> arr = new ArrayList(firstArrayList);
        for (Integer temp : secondArrayList) {
            if(!arr.contains(temp))
                arr.add(temp);
        }

       return arr;
    }
}
