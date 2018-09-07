package aqy.controller;

import aqy.service.CollectService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CollectController {
    public void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        CollectService collectService=new CollectService();
        String id1= request.getParameter("id");
        String name= request.getParameter("name");
        String uid1= request.getParameter("uid");
        int id=Integer.parseInt(id1);
        int uid=Integer.parseInt(uid1);
        int i=0;
        try {
            i=collectService.add(id,name,uid);
            response.getWriter().write(JSON.toJSONString(i));
        } catch (Exception e) {
            e.printStackTrace();
            //1代表没收到
            response.getWriter().write(JSON.toJSONString(1));
        }


    }



}
