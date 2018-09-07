package aqy.dao;

import aqy.entity.Video;

import java.util.List;

public class VideoDAO extends BaseDAO{
    public Video getVideo(String vid){
        String sql="select * from video where vid = ?";
        return super.queryOne(Video.class,sql,vid);
    }
    public List<Video> getVideoo(String num, String num1){
        String sql="select * from video where vid >= ? and vid<=?";
        return super.query(Video.class,sql,num,num1);
    }


}

