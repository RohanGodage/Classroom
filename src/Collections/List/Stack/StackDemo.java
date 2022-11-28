package Collections.List.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(50);


        System.out.println(stack);
        System.out.println("The top element : "+stack.peek());
        System.out.println(stack);
        System.out.println("Removing top element : "+stack.pop());
        System.out.println(stack);
        System.out.println("Removing top element : "+stack.pop());
        System.out.println(stack);
        System.out.println("Search element (20) : "+stack.search(20));
        System.out.println(stack);
        System.out.println("Is empty ? : "+stack.empty());
        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);
        System.out.println("Capacity of stack : "+stack.capacity());
        System.out.println(stack.elements()+" : Stack location");

    }
}
