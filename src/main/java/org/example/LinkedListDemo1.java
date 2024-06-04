package org.example;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        System.out.println("Adding elements to linkedList...");

        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");

        linkedList.add("First");
        linkedList.add("Fifth");

        linkedList.add(1, "One and half");

        System.out.println("Initial linkedList content: ");
        System.out.println(linkedList);

        System.out.println("Removing elements First, Fifth and one half...");

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("One and half");

        System.out.println("Changing element with value Second");
        linkedList.set(0, "Changed" + linkedList.get(0));

        System.out.println("Final linkedList content: ");
        System.out.println("linkedList");
    }
}
