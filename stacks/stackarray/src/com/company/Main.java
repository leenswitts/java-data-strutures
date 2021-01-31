package com.company;

public class Main {

    public static void main(String[] args) {
	ArrayStack stack = new ArrayStack(10);

	//adding to stack
	stack.push(new Employee("lens", "witts", 123));
	stack.push(new Employee("kevin", "naj", 125));
	stack.push(new Employee("wit", "bots", 145));

	// print stack
	stack.printStack();

	//delete from stack
	stack.pop();
	stack.printStack();

	}
}
