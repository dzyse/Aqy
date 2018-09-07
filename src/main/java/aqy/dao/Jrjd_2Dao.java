package aqy.dao;

import aqy.entity.Jrjd_2;

import java.util.List;

public class Jrjd_2Dao extends BaseDAO {
    public List find(){
        String sql="select * from jrjd_2";
        return super.query(Jrjd_2.class,sql);
    }




}
