package aqy.service;

import aqy.dao.HeadDao;
import aqy.entity.Head;

import java.util.ArrayList;
import java.util.List;

public class HeadService {
    public List<Head> find() throws Exception{
        HeadDao headDao=new HeadDao();
        Head head=new Head();
        List<Head> list=new ArrayList<Head>();
       list= headDao.find();
       if(head==null){
           //1代表id不存在
           throw new Exception("1");
       }
       return list;

    }


}
