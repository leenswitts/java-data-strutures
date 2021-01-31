package com.company;

public class Main {

    public static void main(String[] args) {
        Employee leenswitts = new Employee("leens", "witts", 123);
        Employee amosRemijo = new Employee("Amos", "Remijo", 124);
        Employee NathanMutwe = new Employee("Nathan", "Mutwe", 123);

        LinkStack stack = new LinkStack();

        //Adding to stack
        stack.push(leenswitts);
        stack.push(amosRemijo);
        stack.push(NathanMutwe);
        stack.printStack();
        //deleting from stack
        stack.pop();
        stack.printStack();
    }
}
