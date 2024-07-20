package set;

import java.util.Arrays;

/*
index 값과 value 값의 통일 / 빠른 성능 보장
-> 입력값의 범위가 넓다면 메모리 낭비
 */
public class HashStart3 {
    public static void main(String[] args) {

        //입력: 1, 2, 5, 8, 14, 99
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}
