package com.github.ivan100kg.datastructures;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        final int SIZE = 10000000;

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
        List<Integer> vList = new Vector<>(aList);
        testGet(vList);


        // Stack
        List<Integer> sList = new Stack<>();
        sList.addAll(aList);
        testGet(sList);


        // HashMap
        Map<String, Integer> hMap = new HashMap<>();
        for (Integer i : aList) {
            hMap.put(i.toString(), i);
        }
        testGet(hMap);
    }

    static void testGet(List<Integer> list) {
        int size = list.size()/2;
        long start = System.currentTimeMillis();
        int index = size + (int) ((Math.random() * (100 - 1)) + 1);
        int result = list.get(index);
        System.out.println(list.getClass().getSimpleName() + " test get(" + index + ") = " + result + " time: " + (System.currentTimeMillis() - start));
    }

    static void testGet(Map<String, Integer> map) {
        int size = map.size()/2;
        long start = System.currentTimeMillis();
        String key = String.valueOf(size + (int) ((Math.random() * (100 - 1)) + 1));
        Integer result = map.get(key);
        System.out.println(map.getClass().getSimpleName() + " test get(" + key + ") = " + result + " time: " + (System.currentTimeMillis() - start));
    }
}
