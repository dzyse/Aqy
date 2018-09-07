package aqy.service;

import aqy.dao.Jrjd_2Dao;
import aqy.entity.Jrjd_2;

import java.util.ArrayList;
import java.util.List;

public class Jrjd_2Service {
    public List<Jrjd_2> find() throws Exception {
        Jrjd_2Dao jrjd_2Dao=new Jrjd_2Dao();
        List<Jrjd_2> list=new ArrayList<>();
        list=jrjd_2Dao.find();
        if(list==null){
            //1代表未找到
            throw new Exception("1");
        }
        return list;
    }



}
