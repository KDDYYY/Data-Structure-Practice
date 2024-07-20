package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
Java에서 제공하는
LinkedList Node 는 전, 앞, 맨 뒤의 참조 값이 있기 때문에 성는 좋음
-> 뒤에 추가 빠름, 요소들이 연속적으로 위치하기 때문에 CPU 캐시 효율 좋고, 메모리 접근속도 빠름
ArrayList 도 앞에 추가는 배열 전체를 이동시키는 메모리 고속 복사 기능 제공 때문에 성능 좋음
-> 한 칸씩 이동 x
조회는 둘다 성능 느림, 요소가 별도의 객체로 존재하고 다음 요소의 참조를 저장하기 때문에 CPU 캐시 효율 떨어지고,
접근속도 상대적으로 느림
 */

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("MyArrayList 추가");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        List<Integer> arrayList = new ArrayList<>();   //조회용 데이터 사용
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("MyArrayList 조회");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("MyArrayList 검색");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("=========================");

        System.out.println("MyLinkedList 추가");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();    //조회용 데이터 사용
        addLast(linkedList, size);

        System.out.println("MyLinkedList 조회");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("MyLinkedList 검색");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간" + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간" + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간" + (endTime - startTime) + "ms");
    }
}
