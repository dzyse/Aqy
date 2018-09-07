package aqy.controller;

import aqy.service.MobileMessageCheck;
import aqy.service.MobileMessageSend;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class YanzhenmaController {
        public void getYanZhen(HttpServletRequest request, HttpServletResponse response)throws Exception{
            String phone=request.getParameter("cardno");
            String str=MobileMessageSend.sendMsg(phone);
            response.getWriter().write(str);
        }

      public void checkYanZhen(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String phone=request.getParameter("cardno");
        String code=request.getParameter("yanzhenma");
        String str=MobileMessageCheck.checkMsg(phone,code);
        if("success".equals(str)){
            //1为核查正确
            response.getWriter().write("1");
        }else{
            //0为核查错误
            response.getWriter().write("0");
        }

    }



}
