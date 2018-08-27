package aqy.controller;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController extends HttpServlet{
    @Override
    //利用反射，调用方法
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url=request.getRequestURI();
        String className = url.substring(1,url.lastIndexOf("/"));
        className = className.substring(0,1).toUpperCase()+className.substring(1)+"Controller";
        try {
            Class<?> clazz=Class.forName("aqy.controller."+className);
            Object obj=clazz.newInstance();
            String methodName = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
            Method method=clazz.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(obj,request,response);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("404");
        }
    }
}
