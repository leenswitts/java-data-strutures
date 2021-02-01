package com.company;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	 Employee leenswitts = new Employee("leens", "witts", 132);
	 Employee Amos = new Employee("Amos", "Remijo", 142);
	 Employee mummyW = new Employee("Mummy", "witten", 152);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(leenswitts);
        queue.add(Amos);
        queue.add(mummyW);
        queue.printQueue();

        System.out.println("**** after remove ***");
        queue.remove();
        queue.printQueue();
        System.out.println("**** Peek Queue ***");
        System.out.println(queue.peek());




    }


}
