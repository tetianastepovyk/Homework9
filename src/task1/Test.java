package task1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList();

        myArrayList.add("Hello");
        myArrayList.add("Salut");
        myArrayList.add("Привіт");
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.size());

        myArrayList.add("Hello");
        myArrayList.add("Привіт");
        System.out.println(myArrayList.size());

        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("Cat");
        myLinkedList.add("Dog");
        myLinkedList.add("Fox");

        System.out.println("myLinkedList "+myLinkedList.size());
        myLinkedList.clear();
        System.out.println("myLinkedList "+myLinkedList.size());
        myLinkedList.add("Cat");
        myLinkedList.add("Dog");
        myLinkedList.add("Fox");
        System.out.println("myLinkedList "+myLinkedList.size());

        MyQueue<Integer> myQueue = new MyQueue();
        System.out.println("myQueue peek "+myQueue.peek());
        System.out.println("myQueue poll "+myQueue.poll());
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println("myQueue "+myQueue.size());
        myQueue.clear();
        System.out.println("myQueue "+myQueue.size());
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println("myQueue "+myQueue.size());
        System.out.println("myQueue peek "+myQueue.peek());
        System.out.println("myQueue poll "+myQueue.poll());
        System.out.println("myQueue "+myQueue.size());

        MyStack<String> myStack = new MyStack();

        System.out.println("myStack peek "+myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        myStack.add("First");
        myStack.add("Second");
        myStack.add("Third");
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        myStack.clear();
        System.out.println(myStack.size());

        Map myMap = new HashMap<>();
    }
}
