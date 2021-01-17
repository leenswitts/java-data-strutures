package com.company;

public class EmployeeLinkedList {
    private  EmployeeNode head;

    public void addToFront(employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;

    }
}
