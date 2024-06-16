package org.example;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //dessa forma o programa não conhece a implementação, somente a interface
        System.out.println("Seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
//        Department department = new Department(4, "Books");
//        List<Seller> sellers = sellerDao.findByDepartment(department);
//        System.out.println("Seller findByDepartmaloent");


//        System.out.println("Insert");
//        Seller seller = new Seller(null,"Joana", "Joana@gmail.com", new Date(), 1500., department);
//        sellerDao.insert(seller);
//        System.out.println("Inserted!  New id = " + seller.getId());
//
//        System.out.println("Update");
//        seller = sellerDao.findById(5);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println(seller);

//        System.out.println("Seller delete");
//        sellerDao.deleteById(19);



    }
}