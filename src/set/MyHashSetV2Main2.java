package set;

import set.member.Member;

/*
Member 객체
-> hashCode 재정의 필요!!
 */
public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);;

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("psring.hashCode() = " + spring.hashCode());
        System.out.println(set);

        //검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(searchValue) = " + result);

        //삭제
        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println(set);
    }
}
