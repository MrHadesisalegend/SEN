package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinIntList {

    private ArrayList<Integer> list;
    private int min;
    private int max;

    public MaxMinIntList() {
        list = new ArrayList<>();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }

    public boolean add(Integer e) {
        if (e < min) {
            min = e;
        }
        if (e > max) {
            max = e;
        }
        return list.add(e);
    }

    public int min() {
        return min;
    }

    public int max() {
        return max;
    }

    public boolean repOk() {
        return list.stream().allMatch(e -> e <= max) &&
               list.stream().allMatch(e -> e <= min);
    }

    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println("Smallest element: " + list.min());
        System.out.println("Largest element: " + list.max());
    }
}

