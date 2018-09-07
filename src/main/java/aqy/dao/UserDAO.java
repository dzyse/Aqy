package aqy.dao;

import aqy.entity.Account;

import java.sql.Connection;
import java.util.List;

public class UserDAO extends BaseDAO{
    public Account getuser(String phone){
        String sql="select * from user where phone = ?";
        return super.queryOne(Account.class,sql,phone);
    }
    public int insertUserRecord(Connection conn, Account person){
        String sql = "insert into user(phone,password)values(?,?)";
        return super.update(conn,sql,person.getPhone(),person.getPassword());
    }



}
