package com.company;

import java.util.List;
import java.util.Vector;

public class Main {
//declaration of a vector Note vectors are synchronized
    public static void main(String[] args) {
        List<employee> employeeList = new Vector<>();
        employeeList.add(new employee("leens", "witts", 123));
        employeeList.add(new employee("kevin", "naj", 234));
    }
}
