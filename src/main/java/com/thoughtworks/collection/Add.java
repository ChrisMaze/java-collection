package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import  java.util.ArrayList;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int i,j,sum=0;
        if (leftBorder <= rightBorder)
        {
            if(leftBorder % 2 == 0) i = leftBorder; else i = leftBorder + 1;
            if(rightBorder % 2 == 0) j = rightBorder; else j = rightBorder - 1;
        }else
        {
            if(rightBorder % 2 == 0) i = rightBorder; else i = rightBorder + 1;
            if(leftBorder % 2 == 0) j = leftBorder; else j = leftBorder - 1;
        }
        for(; i <= j; i += 2)
            sum += i;
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int i,j,sum=0;
        if (leftBorder <= rightBorder)
        {
            if(leftBorder % 2 == 1) i = leftBorder; else i = leftBorder + 1;
            if(rightBorder % 2 == 1) j = rightBorder; else j = rightBorder - 1;
        }else
        {
            if(rightBorder % 2 == 1) i = rightBorder; else i = rightBorder + 1;
            if(leftBorder % 2 == 1) j = leftBorder; else j = leftBorder - 1;
        }
        for(; i <= j; i += 2)
            sum += i;
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum =0;
        for (Integer temp : arrayList) {
            sum += temp*3+2;
        }
        return  sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        int i = 0;
        for (Integer temp : arrayList) {
            if(temp % 2 == 1)
            {
                arrayList.set(i, temp*3+2);
            }
            i++;
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum =0;
        for (Integer temp : arrayList) {
            if(temp % 2 == 1)
            sum += temp*3+5;
        }
        return  sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> arr = new ArrayList();
        for (int i = 1; i <arrayList.size() ; i++) {
            arr.add((arrayList.get(i-1)+arrayList.get(i))*3);
        }
        return arr;
    }
}
