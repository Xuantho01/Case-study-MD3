package model;

import java.sql.Date;

public class oder {
    private String oderCode;
    private String userName;
    private String productList;
    private int totalAmount;
    private float totalPrice;
    private Date dateBuy;
    private String status;

    public oder() {
    }

    public oder(String oderCode, String userName,
                String productList, int totalAmount,
                float totalPrice, Date dateBuy, String status) {
        this.oderCode = oderCode;
        this.userName = userName;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.totalPrice = totalPrice;
        this.dateBuy = dateBuy;
        this.status = status;
    }

    public String getOderCode() {
        return oderCode;
    }

    public void setOderCode(String oderCode) {
        this.oderCode = oderCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
