package com.jianghaobo.User;

public class OrderDomin {
    private long id;
    private  String userid;
    private  String merchantid;
    private  String commodityid;
    private  String commoditynumber;
    private  long ctime;
    private  String price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommoditynumber() {
        return commoditynumber;
    }

    public void setCommoditynumber(String commoditynumber) {
        this.commoditynumber = commoditynumber;
    }

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDomin{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", merchantid='" + merchantid + '\'' +
                ", commodityid='" + commodityid + '\'' +
                ", commoditynumber='" + commoditynumber + '\'' +
                ", ctime=" + ctime +
                ", price='" + price + '\'' +
                '}';
    }
}
