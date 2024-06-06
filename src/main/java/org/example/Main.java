package org.example;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao(); //dessa forma o programa não conhece a implementação, somente a interface
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}