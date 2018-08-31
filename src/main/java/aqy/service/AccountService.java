package aqy.service;

import aqy.dao.UserDAO;
import aqy.dao.VideoDAO;
import aqy.entity.Account;
import aqy.entity.Video;

import java.util.List;

public class AccountService {
    UserDAO userDAO=new UserDAO();

    public Account login(String id,String password)throws Exception{
        Account list=userDAO.getuser(id);
        System.out.println(list);
        System.out.println(list.getPassword());
        if(list==null){

            throw new Exception("账号不存在");

        }else {
            if (!list.getPassword().equals(password)){

                throw new Exception("密码错误");
            }
        }


        return list;
    }
    public Integer getVV(String vid) throws Exception {
        VideoDAO videoDAO=new VideoDAO();
        Video video = videoDAO.getVideo(vid);
        Integer good = video.getVgood();
        if (good<0){
            throw new Exception("1");
        }
        return good;
    }
}
