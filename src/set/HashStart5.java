package set;

import java.util.Arrays;
import java.util.LinkedList;

/*
해쉬 충돌 구현
자료구조 추가
-> LinkedList
 */
public class HashStart5 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        LinkedList<Integer> [] buckets = new LinkedList[CAPACITY];
        for (int i = 0 ; i<CAPACITY; i++){
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = " + Arrays.toString(buckets));

        //입력: 1, 2, 5, 8, 14, 99
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket,contains(" + searchValue + ") = " + contains);

    }
    static int hashIndex(int value){
        return value % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);

    }

    private static void add(LinkedList<Integer> [] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        if(!bucket.contains(value)) {   //O(n)
            bucket.add(value);
        }
    }
}
