package model.dao;


import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { //Classe auxiliar responsável por instanciar os DAOs.
    
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection()); //referenciamos SellerDaoJDBC pois é ele quem implementa a interface SellerDao
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection()); //referenciamos DepartmentDaoJDBC pois é ele quem implementa a interface DepartmentDao
    }
}
