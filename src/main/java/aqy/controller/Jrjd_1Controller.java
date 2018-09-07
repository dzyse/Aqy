package aqy.controller;

import aqy.service.Jrjd_1Service;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jrjd_1Controller {
    public  void  find(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Jrjd_1Service jrjd_1Service=new Jrjd_1Service();
        List list=new ArrayList();
        try {
            list=jrjd_1Service.find();
            response.getWriter().write(JSON.toJSONString(list));
        } catch (Exception e) {
            e.printStackTrace();
            //1代表未找到
            response.getWriter().write(JSON.toJSONString("1"));
        }

    }



}
