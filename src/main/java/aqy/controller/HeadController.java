package aqy.controller;

import aqy.service.HeadService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HeadController {
    public  void find(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HeadService headService=new HeadService();
        List list=new ArrayList();
        try {
          list=headService.find();
          response.getWriter().write(JSON.toJSONString(list));
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("1");
        }
    }



}
