package aqy.controller;

import aqy.entity.Account;
import aqy.service.AccountService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController {
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入Controller层方法");
        String cardno = request.getParameter("cardno");
        String password =request.getParameter("password");
        System.out.println(password);
        AccountService accountService=new AccountService();
        try {
            Account account=accountService.login(cardno,password);
            request.getSession().setAttribute("user",account);
            String JSONStr=JSON.toJSONString(account);
            System.out.println(JSONStr);
            response.getWriter().write(JSONStr);
        } catch (Exception e) {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
            System.out.println(JSON.toJSONString(e.getMessage()));
        }
    }
}
