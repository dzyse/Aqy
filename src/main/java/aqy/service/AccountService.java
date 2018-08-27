package aqy.service;

import aqy.dao.UserDAO;
import aqy.entity.Account;

import java.util.List;

public class AccountService {
    UserDAO userDAO=new UserDAO();

    public Account login(String id,String password)throws Exception{
        Account list=userDAO.getuser(id);
        if(list==null){
            throw new Exception("账号不存在");
        }else {
            if (!list.getPassword().equals(password)){
                throw new Exception("密码错误");
            }
        }


        return list;
    }
}
