package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> arr = new ArrayList();
        while (number > 1)
        {
            number -= random.nextInt(3) ;
            arr.add(number);
        }
        return arr;
    }
}
