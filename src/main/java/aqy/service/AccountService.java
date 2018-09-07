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
//        System.out.println(list);
//        System.out.println(list.getPassword());
        if(list==null){
            //1为账号不存在
            throw new Exception("1");

        }else {
            if (!list.getPassword().equals(password)){
                //2为账号不存在
                throw new Exception("2");
            }
        }
        return list;
    }




    public Integer getVV(String vid) throws Exception {
        VideoDAO videoDAO=new VideoDAO();
        Video video = videoDAO.getVideo(vid);
        Integer good = video.getVnum();
        if (good<0){
            throw new Exception("1");
        }
        return good;
    }

    public List<Video> getVideo(String num, String num1){
        VideoDAO video=new VideoDAO();
        List<Video> list=video.getVideoo(num, num1);

        return list;
    }








}
