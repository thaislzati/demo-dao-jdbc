package org.example;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class main2 {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao(); //dessa forma o programa não conhece a implementação, somente a interface
        System.out.println("Seller findById");
        Seller seller = sellerDao.findById(3);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//        Department dep = departmentDao.findById(9);
//        System.out.println(dep);

//        System.out.println("Find by department");
//        Department dep = departmentDao.findBySeller(seller);
//        System.out.println(dep);


        Department department = new Department(10, "thaís");
//        departmentDao.insert(department);

//        departmentDao.update(department);
        departmentDao.deleteById(10);

        System.out.println("Find all");
        List<Department> dep = departmentDao.findAll();
        for (Department obj: dep) {
            System.out.println(obj);
        }
    }

}
