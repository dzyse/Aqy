package aqy.controller;

import aqy.entity.Account;
import aqy.service.AccountService;
import aqy.service.RegisterService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController {
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("进入Controller层方法");
        String cardno = request.getParameter("cardno");
        String password = request.getParameter("password");
<<<<<<< HEAD
        System.out.println(password);
        AccountService accountService = new AccountService();
        try {
            Account account = accountService.login(cardno, password);
            request.getSession().setAttribute("user", account);
            String JSONStr = JSON.toJSONString(account);
            System.out.println(JSONStr);
=======
//        System.out.println(password);
        AccountService accountService = new AccountService();
        try {
            Account account = accountService.login(cardno, password);
//            request.getSession().setAttribute("user", account);
            String JSONStr = JSON.toJSONString(account);
//            System.out.println(JSONStr);
>>>>>>> 取点赞数
            response.getWriter().write(JSONStr);
        } catch (Exception e) {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
//            System.out.println(JSON.toJSONString(e.getMessage()));
        }
    }

<<<<<<< HEAD
    public void records(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RegisterService loginSeriver = new RegisterService();
        String phone = request.getParameter("phone");
=======
    public void records(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RegisterService loginSeriver = new RegisterService();
        String phone = request.getParameter("cardno");
>>>>>>> 取点赞数
        String password = request.getParameter("password");
        int result = loginSeriver.register(phone, password);
        response.getWriter().write("1");


    }
<<<<<<< HEAD
=======


    public void login2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RegisterService loginSeriver = new RegisterService();
        String phone = request.getParameter("cardno");
        try {
            Account account = loginSeriver.login2(phone);
            response.getWriter().write(JSON.toJSONString(account));
        } catch (Exception e) {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
        }
    }
>>>>>>> 取点赞数
}