package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department findById ====");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ====");
        List<Department> list = departmentDao.findAll(null);
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: department insert ====");
        Department newDepartment = new Department(null, "Clothes");
        departmentDao.insert(newDepartment);
        System.out.println(newDepartment);

        System.out.println("\n=== TEST 4: department update ====");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println(dep2);
        
        System.out.println("\n=== TEST 5: department deleteById ====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }
}
