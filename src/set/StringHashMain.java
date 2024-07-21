package set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {

        //char
        char charA = 'A';       //65
        char charB = 'B';       //66
        System.out.println("charA = " + (int) charA);
        System.out.println("(int)charB = " + (int) charB);

        //hashCode
        System.out.println();
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println();
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        //65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
