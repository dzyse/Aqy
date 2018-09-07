package aqy.dao;

import aqy.entity.Head;
import aqy.entity.Jrjd_1;

import java.util.List;

public class Jrjd_1Dao extends BaseDAO{
    public List find(){
        String sql="select * from jrjd_1";
        return super.query(Jrjd_1.class,sql);
    }


}
