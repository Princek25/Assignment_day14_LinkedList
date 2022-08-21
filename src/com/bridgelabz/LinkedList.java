package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;


    public void push(T data) {
        Node<T> newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void show(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void add(T data){
        Node<T> node=new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


