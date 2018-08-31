package aqy.controller;

import aqy.service.AccountService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VideoController {
    public Integer getVV(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String vid = request.getParameter("vid");
        AccountService accountService=new AccountService();
        try {
            Integer good=accountService.getVV(vid);
            String JSON = com.alibaba.fastjson.JSON.toJSONString(good);
            response.getWriter().write(JSON);
        } catch (Exception e) {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
        }
        return null;
    }
}
