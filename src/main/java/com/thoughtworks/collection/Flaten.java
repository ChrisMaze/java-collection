package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> arr = new ArrayList();
        for (int i =0 ;i<array.length;i++)
            for (int j = 0; j<array[i].length;j++)
            {
                arr.add(array[i][j]);
            }
        return arr;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> arr = new ArrayList();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(!arr.contains(array[i][j]))
                arr.add(array[i][j]);
            }
        }
        return arr;
    }
}
