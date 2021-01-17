package com.company;

public class EmployeeNode {
    private employee employee;
    private  EmployeeNode employeeNode;

    public EmployeeNode(employee employee){
        this.employee = employee;
    }

    public com.company.employee getEmployee() {
        return employee;
    }

    public void setEmployee(com.company.employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getEmployeeNode() {
        return employeeNode;
    }

    public void setEmployeeNode(EmployeeNode employeeNode) {
        this.employeeNode = employeeNode;
    }
}
