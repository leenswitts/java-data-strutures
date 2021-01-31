package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkStack {
    private LinkedList<Employee> stack;

    public  LinkStack(){
        stack = new LinkedList<Employee>();
    }

    public void  push(Employee employee){
        stack.push(employee);
    }

    public Employee pop (){
        return  stack.pop();
    }

    public  Employee peek(){
        return stack.peek();
    }

    public  void  printStack(){
        ListIterator<Employee> iter =  stack.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
