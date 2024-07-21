package set;

/*
데이터 추가할 때마다 성능이 좋지 않음
 */
public class MyHashSetV3Main {
    public static void main(String[] args) {

        MySet<String> stringSet = new MyHashSetV3<>(10);
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        System.out.println(stringSet);

        //검색
        String searchValue = "A";
        boolean result = stringSet.contains(searchValue);
        System.out.println("result = " + result);

    }
}
