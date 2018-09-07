package aqy.controller;

import aqy.entity.Jrjd_2;
import aqy.service.Jrjd_2Service;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jrjd_2Controller {
    public void find(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Jrjd_2Service jrjd_2Service=new Jrjd_2Service();
        List list=new ArrayList();
        try {
            list=jrjd_2Service.find();
            response.getWriter().write(JSON.toJSONString(list));

        } catch (Exception e) {
            e.printStackTrace();
            //1代表没找到
            response.getWriter().write(JSON.toJSONString(1));
        }
    }



}
