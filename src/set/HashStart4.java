package set;

import java.util.Arrays;

/*
해쉬 알고리즘을 통한 index
하지만 해시 충돌 충돌 가능
ex)     1 % 10 = 1;
        11 % 10 =1;
 */
public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        //입력: 1, 2, 5, 8, 14, 99
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        Integer result = inputArray[hashIndex(searchValue)];
        System.out.println(result);
    }
    static int hashIndex(int value){
        return value % CAPACITY;
    }

    private static void add(Integer[] inputArray, int value){
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
}
