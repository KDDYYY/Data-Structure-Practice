package link;

/*
첫 번째 항목에 대한 추가 삭제는 O(1),
중간, 마지막 항목 추가, 삭제 O(n)

 */

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
       //마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");

        //첫번째 항복에 추가, 삭제 O(1)
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d");
        System.out.println(list);

        System.out.println("첫번째 항복 삭제");
        list.remove(0);
        System.out.println(list);

        //중간 항목에 추가, 삭제 //O(n)
        System.out.println("중간 항목에 추가");
        list.add(1, "e");
        System.out.println(list);

        System.out.println("중간 항목 삭제");
        list.remove(1);
        System.out.println(list);
    }
}
