package aqy.entity;

public class Video {
    private Integer vid;
    private String vname;
    private String vformat;
    private Integer vtime;
    private String vintro;
    private Integer vnum;
    private Double vgrade;
    private String vsite;
    private Integer vvip;
    private String vtype;
    private String tip;
    private String vmintro;

    public Video() {
    }

    public Video(Integer vid, String vname, String vformat, Integer vtime, String vintro, Integer vnum, Double vgrade, String vsite, Integer vvip, String vtype, String tip, String vmintro) {
        this.vid = vid;
        this.vname = vname;
        this.vformat = vformat;
        this.vtime = vtime;
        this.vintro = vintro;
        this.vnum = vnum;
        this.vgrade = vgrade;
        this.vsite = vsite;
        this.vvip = vvip;
        this.vtype = vtype;
        this.tip = tip;
        this.vmintro = vmintro;
    }

    @Override
    public String toString() {
        return "Video{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                ", vformat='" + vformat + '\'' +
                ", vtime=" + vtime +
                ", vintro='" + vintro + '\'' +
                ", vnum=" + vnum +
                ", vgrade=" + vgrade +
                ", vsite='" + vsite + '\'' +
                ", vvip=" + vvip +
                ", vtype=" + vtype +
                ", tip='" + tip + '\'' +
                ", vmintro='" + vmintro + '\'' +
                '}';
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVformat() {
        return vformat;
    }

    public void setVformat(String vformat) {
        this.vformat = vformat;
    }

    public Integer getVtime() {
        return vtime;
    }

    public void setVtime(Integer vtime) {
        this.vtime = vtime;
    }

    public String getVintro() {
        return vintro;
    }

    public void setVintro(String vintro) {
        this.vintro = vintro;
    }

    public Integer getVnum() {
        return vnum;
    }

    public void setVnum(Integer vnum) {
        this.vnum = vnum;
    }

    public Double getVgrade() {
        return vgrade;
    }

    public void setVgrade(Double vgrade) {
        this.vgrade = vgrade;
    }

    public String getVsite() {
        return vsite;
    }

    public void setVsite(String vsite) {
        this.vsite = vsite;
    }

    public Integer getVvip() {
        return vvip;
    }

    public void setVvip(Integer vvip) {
        this.vvip = vvip;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getVmintro() {
        return vmintro;
    }

    public void setVmintro(String vmintro) {
        this.vmintro = vmintro;
    }
}
