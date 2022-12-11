package task1;

import java.util.LinkedList;
import java.util.List;

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


    }
}
