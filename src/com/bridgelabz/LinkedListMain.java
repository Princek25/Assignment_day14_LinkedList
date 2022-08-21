package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.push(70);
        list1.push(56);
        list1.insert(30);
        System.out.println(list1.pop());
        list1.display();
        System.out.println();
        list1.display();
    }
}
