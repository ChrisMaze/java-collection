package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        List<Integer> arr = new ArrayList(arrayList);
        arr.sort(null);
        return arr.get(arr.size()-1);
    }

    public double getMinimum() {
        List<Integer> arr = new ArrayList(arrayList);
        arr.sort(null);
        return arr.get(0);
    }

    public double getAverage() {
        double sum = 0;
        for (Integer temp: arrayList) {
            sum += temp;
        }
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> arr = new ArrayList(arrayList);
        arr.sort(null);

        return (arr.size()%2 ==1) ? arr.get(arr.size()/2) : (arr.get(arr.size()/2)+arr.get(arr.size()/2 - 1))/2.0;
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double mid0 =0 ;
        int right=0;
        if (arrayList.size()%2 == 0)
            right = arrayList.size()/2;
        mid0 = ((double)singleLink.getNode(right)+(double)singleLink.getNode(right-1))/2.0;
        Double mid = new Double(mid0);
        return mid;

    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
