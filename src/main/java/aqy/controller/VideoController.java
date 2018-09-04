package aqy.controller;

import aqy.entity.Video;
import aqy.service.AccountService;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class VideoController {
    public void getVV(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String vid = request.getParameter("vid");
        AccountService accountService=new AccountService();
        try {
            Integer good=accountService.getVV(vid);
            String JSON = com.alibaba.fastjson.JSON.toJSONString(good);
            response.getWriter().write(JSON);
        } catch (Exception e) {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
        }

    }
    public void getVideo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String num=request.getParameter("num");
        AccountService accountService=new AccountService();
        List<Video> video=accountService.getVideo();
        String JSON= com.alibaba.fastjson.JSON.toJSONString(video);
        response.getWriter().write(JSON);

    }
}
