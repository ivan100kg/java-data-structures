package com.github.ivan100kg.datastructures;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        final int SIZE = 10000000; // 10b

        // primitive array
        int[] pArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            pArray[i] = (int) (Math.random() * SIZE);
        }
        long start = System.currentTimeMillis();


        // ArrayList
        List<Integer> aList = new ArrayList<>();
        for (int i : pArray) aList.add(i);
        testGet(aList);


        // LinkedList
        List<Integer> lList = new LinkedList<>(aList);
        testGet(lList);


        // Vector
        Vector<Integer> vList = new Vector<>(aList);
        testGet(vList);


        // Stack
        Stack<Integer> sList = new Stack<>();
        sList.addAll(aList);
        testGet(sList);
    }

    static void testGet(List<Integer> list) {
        final int INDEX = 4500000;
        long start = System.currentTimeMillis();
        int result = list.get(INDEX + (int) ((Math.random() * (100 - 1)) + 1));
        System.out.println(list.getClass().getSimpleName() + " test get(index) time: " + (System.currentTimeMillis() - start));
    }
}
