package aqy.dao;

import aqy.entity.Head;

import java.util.List;

public class HeadDao extends BaseDAO {
    public List find(){
        String sql="select * from head";
        return super.query(Head.class,sql);
    }
}
