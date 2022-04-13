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


        // ArrayList
        List<Integer> aList = new ArrayList<>();
        for (int i : pArray) aList.add(i);
        testGet(aList);
        testAddToMiddle(aList);


        // LinkedList
        List<Integer> lList = new LinkedList<>(aList);
        testGet(lList);
        testAddToMiddle(lList);


        // Vector
        List<Integer> vList = new Vector<>(aList);
        testGet(vList);
        testAddToMiddle(vList);


        // Stack
        List<Integer> sList = new Stack<>();
        sList.addAll(aList);
        testGet(sList);
        testAddToMiddle(sList);


        // HashMap
        Map<String, Integer> hMap = new HashMap<>();
        for (Integer i : aList) {
            hMap.put(i.toString(), i);
        }
        testGet(hMap);
        testAddToMiddle(hMap);


        // TreeMap
        Map<String, Integer> tMap = new TreeMap<>();
        for (Integer i : aList) {
            tMap.put(i.toString(), i);
        }
        testGet(tMap);
        testAddToMiddle(tMap);


        // LinkedHashMap
        Map<String, Integer> lhMap = new LinkedHashMap<>();
        for (Integer i : aList) {
            lhMap.put(i.toString(), i);
        }
        testGet(lhMap);
        testAddToMiddle(lhMap);


        // HashTable
        Map<String, Integer> htMap = new Hashtable<>();
        for (Integer i : aList) {
            htMap.put(i.toString(), i);
        }
        testGet(htMap);
        testAddToMiddle(htMap);


        // HashSet
        Set<Integer> hSet = new HashSet<>(aList);
        testGet(hSet);
        testAddToMiddle(hSet);
    }

    static void testGet(List<Integer> list) {
        int size = list.size() / 2;
        long start = System.currentTimeMillis();
        int index = size + (int) ((Math.random() * (100 - 1)) + 1);
        int result = list.get(index);
        System.out.println(list.getClass().getSimpleName() + " test get(" + index + ") = " + result + " time: " + (System.currentTimeMillis() - start));
    }

    static void testGet(Set<Integer> set) {
        int size = set.size() / 2;
        long start = System.currentTimeMillis();
        int key = size + (int) ((Math.random() * (100 - 1)) + 1);
        boolean result = set.contains(key);
        System.out.println(set.getClass().getSimpleName() + " test get(" + key + ") = " + result + " time: " + (System.currentTimeMillis() - start));
    }

    static void testGet(Map<String, Integer> map) {
        int size = map.size() / 2;
        long start = System.currentTimeMillis();
        String key = String.valueOf(size + (int) ((Math.random() * (100 - 1)) + 1));
        Integer result = map.get(key);
        System.out.println(map.getClass().getSimpleName() + " test get(" + key + ") = " + result + " time: " + (System.currentTimeMillis() - start));
    }

    static void testAddToMiddle(List<Integer> list) {
        int size = list.size() / 2;
        long start = System.currentTimeMillis();
        int index = size + (int) ((Math.random() * (100 - 1)) + 1);
        list.add(index, index);
        System.out.println(list.getClass().getSimpleName() + " test add(" + index + "," + index + ") = time: " + (System.currentTimeMillis() - start));
    }

    static void testAddToMiddle(Map<String, Integer> map) {
        int size = map.size() / 2;
        long start = System.currentTimeMillis();
        String key = String.valueOf(size + (int) ((Math.random() * (100 - 1)) + 1));
        map.put(key, Integer.valueOf(key));
        System.out.println(map.getClass().getSimpleName() + " test put(" + key + ") = time: " + (System.currentTimeMillis() - start));
    }

    static void testAddToMiddle(Set<Integer> set) {
        int size = set.size() / 2;
        long start = System.currentTimeMillis();
        int key = size + (int) ((Math.random() * (100 - 1)) + 1);
        set.add(key);
        System.out.println(set.getClass().getSimpleName() + " test add(" + key + ") = time: " + (System.currentTimeMillis() - start));
    }
}
