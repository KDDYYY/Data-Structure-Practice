package set.javaset;

import java.util.*;
/*
HashSet: 입력한 순서를 보장하지 않는다. -> O(1)
LinkedHashSet: 입력한 순서를 정확히 보장한다. -> O(1)
TreeSet: 데이터 값을 기준으로 정렬한다.  -> O(logN)
 */

public class JavaSetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set){
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() +" ");
        }
        System.out.println();
    }
}
