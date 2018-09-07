package aqy.service;

import aqy.dao.CollectDao;
import aqy.entity.Collect;

public class CollectService {
    public int add(int id,String name,int uid) throws Exception {
    CollectDao collectDao= new CollectDao();
    int count=0;
    Collect collect=new Collect();
    collect.setId(id);
    collect.setName(name);
    collect.setUid(uid);
    count= collectDao.add(collect);
    if(count==0){
        //1代表未收到
        throw new Exception("1");
        }
    return count;
    }





}
