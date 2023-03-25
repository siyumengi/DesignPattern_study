package com.sym.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        CollegeManager collegeManager = new CollegeManager();
        schoolManager.printAllEmployee(collegeManager);
    }
}

// 学校总部员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    //    返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工的id=" + i);
            list.add(employee);
        }
        return list;
    }
}

// 学校管理类
//SchoolManager 类的直接朋友有哪些 Employee CollegeManager
//CollegeEmployee 不是直接朋友
class SchoolManager{
//    返回学校总部的员工
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工的id=" + i);
            list.add(employee);
        }
        return list;
    }
//    输出学校总部和学院员工信息（id）
//    学院员工
    void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> list = sub.getAllEmployee();
        for (CollegeEmployee l : list){
            System.out.println(l.getId());
        }
//        学校员工总部员工
        List<Employee> allEmployee = this.getAllEmployee();
        for (Employee collegeEmployee : allEmployee){
            System.out.println(collegeEmployee.getId());
        }
    }
}




























