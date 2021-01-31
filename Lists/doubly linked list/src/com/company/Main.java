package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	Employee leensWitts = new Employee("leens", "witts", 123);
	Employee amosMutwe = new Employee("amos", "Mutwe", 124);
	Employee nathanBlock = new Employee("nathan", "Block", 125);
	Employee kevinNaj = new Employee("kevin", "Naj", 126);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(leensWitts);
        list.addFirst(amosMutwe);
        list.addFirst(nathanBlock);
        list.add(kevinNaj);

        Iterator inter = list.iterator();
            System.out.print("Head=>");
        while (inter.hasNext()){
            System.out.print(inter.next());
            System.out.print("<=>");
        }
        System.out.print("null");
    }
}
