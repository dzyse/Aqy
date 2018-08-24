package aqy.entity;

public class Account {
    private Integer uid;
    private String phone;
    private String password;
    private String username;
    private String photo;
    private Double balance;
    private Integer vip;
    private Integer score;
    private Integer vipLevel;
    private Integer experience;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uid=" + uid +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", photo='" + photo + '\'' +
                ", balance=" + balance +
                ", vip=" + vip +
                ", score=" + score +
                ", vipLevel=" + vipLevel +
                ", experience=" + experience +
                '}';
    }

    public Account() {
    }

    public Account(Integer uid, String phone, String password, String username, String photo, Double balance, Integer vip, Integer score, Integer vipLevel, Integer experience) {
        this.uid = uid;
        this.phone = phone;
        this.password = password;
        this.username = username;
        this.photo = photo;
        this.balance = balance;
        this.vip = vip;
        this.score = score;
        this.vipLevel = vipLevel;
        this.experience = experience;
    }
}
