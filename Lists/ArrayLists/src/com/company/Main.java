package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<employee> employeeList = new ArrayList<>();
        employeeList.add(new employee("leens", "witts" , 123));
        employeeList.add(new employee("jason", "Andrew" , 124));
        employeeList.add(new employee("Amos", "Remijo" , 125));
        employeeList.add(new employee("Naj", "Kevin", 127));

//        printing all employee/item in a list
        employeeList.forEach(employee -> System.out.println(employee));

//        printing employee/item at a specific index
       System.out.println(employeeList.get(1));

//       replacing an employee/item in list
        employeeList.set(0, new employee("witbots","Studio", 122));
        System.out.println(employeeList.get(0));

    }
}
