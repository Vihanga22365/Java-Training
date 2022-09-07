package model;

import service.BDServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BDFinder {
    BDServiceImpl bdServiceImpl =new BDServiceImpl();

    @WebMethod
    public int calculateDB(int year,int month,int day){
        return bdServiceImpl.calculateDB(year, month, day);
    }
}
