package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { //Classe auxiliar responsável por instanciar os DAOs.
    
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(); //macete para não expor a implementacao da interface
    }
}
