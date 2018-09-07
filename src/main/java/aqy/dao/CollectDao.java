package aqy.dao;

import aqy.entity.Collect;

import java.util.List;

public class CollectDao  extends BaseDAO{
    public  int add(Collect collect) {
        String sql="insert into collect (id,name,uid) values(?,?,?)";
        return super.update( sql,collect.getId(),collect.getName(),collect.getUid());
    }
}
