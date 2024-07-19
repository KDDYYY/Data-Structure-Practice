package link;

/*
index 로 특정 위치에 있는 데이터를 반환
-> ArrayList 는 O(1)의 빠른 성능이지만 LinkedList는 사용하는 노드들의 벼일이 아니고
단순히 다음 노드의 참조가 있을 뿐이이다. 이 때문에 원하는 index의 데이터를 찾기 위해
index 숫자 만큼 다음 노드를 반복해서 찾아야 하기 때문에 성능이 매우 나쁘다
O(n)

마지막 노드를 찾을 때도 마찬가지, 하지만 추가할 때는 연결만 시키면 되기 때문에 O(1)
 */

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("데이터 추가");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");

        System.out.println("기능 사용");
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
        System.out.println(list);


        System.out.println("범위 초과");
        list.add("d");
        System.out.println(list);
        list.add("e");
        list.add("f");
        System.out.println(list);
    }
}
