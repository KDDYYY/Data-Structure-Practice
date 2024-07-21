package set;
/*
데이터 추가할 때마다 성능이 좋지 않음
 */
public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hashIndex 중복
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(searchValue) = " + result);

        //삭제
        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println(set);
    }
}
