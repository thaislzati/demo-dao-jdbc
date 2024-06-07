package org.example;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //dessa forma o programa não conhece a implementação, somente a interface
//        System.out.println("Seller findById");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        System.out.println("Seller findByDepartmaloent");
        for (Seller obj : sellers ){
            System.out.println(obj);
        }
    }
}