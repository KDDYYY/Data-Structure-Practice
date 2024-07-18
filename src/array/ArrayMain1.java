package array;

import java.util.Arrays;

/*
배열에서 index 로 찾는것은 빠르지만
배열 안에 들어가서 데이터 찾는것은 느림
*/

public class ArrayMain1 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        System.out.println("== index 입력 O(1) ==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 변경 O(1) ==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 조회 O(1) ==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("== 배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if ((arr[i] == value)){
                System.out.println(value + "찾음");
                break;
            }
        }
    }
}
