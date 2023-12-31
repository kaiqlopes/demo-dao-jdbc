package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        int id;

        /*System.out.println("\n== Test 1: department insert method ===");
        System.out.print("\nName of the department: ");
        String departmentName = sc.next();
        Department department = new Department(departmentName);
        departmentDao.insert(department);
        System.out.println("Department successfully inserted!, department id: " + department.getId());*/

        System.out.println("\n== Test 1: department findById method ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n== Test 2: department update method ===");
        dep.setName("Logistics");
        departmentDao.update(dep);
        dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n== Test 3: department delete method ===");
        departmentDao.deleteById(7);
        System.out.println("Data succefully deleted!");

        System.out.println("\n== Test 4: department findAll method ===");
        List<Department> depList = departmentDao.findAll();

        for (Department obj : depList) {
            System.out.println(obj);
        }

        sc.close();
    }

}
