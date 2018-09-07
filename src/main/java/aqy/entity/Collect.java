package aqy.entity;

public class Collect {
    private Integer id;
    private String name;
    private  Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Collect(Integer id, String name, Integer uid) {
        this.id = id;
        this.name = name;
        this.uid = uid;
    }

    public Collect() {
    }

}
