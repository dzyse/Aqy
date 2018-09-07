package aqy.service;

import aqy.dao.Jrjd_1Dao;
import aqy.entity.Jrjd_1;

import java.util.ArrayList;
import java.util.List;

public class Jrjd_1Service {
    public List<Jrjd_1> find() throws Exception {
        List<Jrjd_1> list =new ArrayList();
        Jrjd_1 jrjd_1=new Jrjd_1();
        Jrjd_1Dao jrjd_1Dao=new Jrjd_1Dao();
        list=jrjd_1Dao.find();
        if(list==null){
            //1代表未找到
            throw new Exception("1");
        }
        return list;

    }




}
