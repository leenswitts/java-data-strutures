package com.company;

import java.util.Objects;

public class Employee {
    private  String fName;
    private  String lName;
    private  int id;

    public Employee(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getfName().equals(employee.getfName()) && getlName().equals(employee.getlName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getfName(), getlName(), getId());
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", id=" + id +
                '}';
    }
}
