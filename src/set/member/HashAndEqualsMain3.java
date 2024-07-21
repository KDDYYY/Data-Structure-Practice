package set.member;

import set.MyHashSetV2;
/*
hashCode()를 항상 재정의해야하는것은 아니지만 해시 자료 구조를 사용하는 경우
hashCode()와 equals()를 반드시 함께 재정의해야 한다.
 */

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
