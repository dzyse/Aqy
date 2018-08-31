package aqy.dao;

import aqy.entity.Video;

public class VideoDAO extends BaseDAO{
    public Video getVideo(String vid){
        String sql="select * from video where vid = ?";
        return super.queryOne(Video.class,sql,vid);
    }
}
