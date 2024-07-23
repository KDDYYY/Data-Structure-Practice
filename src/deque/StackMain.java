package deque;

import java.util.Stack;
/*
자바의 Stack 클래스는 Vector
자료구조를 사용하기 때문에 사용하지 않는것이 좋다
 */

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인 (꺼내지는 않음)
        System.out.println("stack.peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
