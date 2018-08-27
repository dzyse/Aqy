package aqy.dao;

import aqy.entity.Account;

import java.util.List;

public class UserDAO extends BaseDAO{
    public Account getuser(String id){
        String sql="select * from user where phone = ?";
        return super.queryOne(Account.class,sql,id);
    }
}
