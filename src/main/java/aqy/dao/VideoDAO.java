package aqy.dao;

import aqy.entity.Video;

import java.util.List;

public class VideoDAO extends BaseDAO{
    public Video getVideo(String vid){
        String sql="select * from video where vid = ?";
        return super.queryOne(Video.class,sql,vid);
    }
    public List<Video> getVideoo(){
        String sql="select * from video where vid >= 23 and vid<=27";
        return super.query(Video.class,sql);
    }
}

