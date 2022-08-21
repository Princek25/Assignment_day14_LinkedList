package com.bridgelabz;

public class LinkedList<T> {
    Node head;
    Node<T> tail;


    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(T data) {
        Node newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        head.next = node;
        node.next = tail;
    }

    public T pop() {
        T deleteElement = (T) head.data;
        head = head.next;
        return deleteElement;
    }
    public T popLast(){
        T deleteElement = tail.data;
        Node<T> temp = head;
        while (temp.next != tail){
            temp=temp.next;
        }
        temp.next=null;
        temp=tail;
        return deleteElement;
    }
}


