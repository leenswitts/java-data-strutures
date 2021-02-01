package com.company;

public class Employee {
    private  String lName;
    private  String fName;
    private  int id;

    public Employee(String lName, String fName, int id) {
        this.lName = lName;
        this.fName = fName;
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", id=" + id +
                '}';
    }
}
