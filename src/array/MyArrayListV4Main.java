package array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);
        String s = stringList.get(0);
        System.out.println("string = " + s);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(stringList);
        Integer i = integerList.get(0);
        System.out.println("integer = " + i);
    }
}
