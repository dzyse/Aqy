package aqy.service;

import aqy.dao.UserDAO;
import aqy.entity.Account;
import aqy.util.JdbcUtil;

import java.sql.Connection;

public class RegisterService implements seriver.BaseService{
        private UserDAO personDao=new UserDAO();
        public int register(String phone,String password){
            Connection conn = JdbcUtil.getConn();
            Account person = new Account();
            person.setPhone(phone);
            person.setPassword(password);
            personDao.insertUserRecord(conn,person);
            JdbcUtil.closeAll(null,null,conn);
            return 1;
        }




    }


