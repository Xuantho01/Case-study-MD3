package model;

public class Product {
    private String productCode;
    private String productName;
    private float price;
    private float discount;
    private int amount;
    private String supplier;
    private String typeCode;
    private String image;
    private int amountImport;
    private int amountExport;
    private String description;
    private String userName;
    private String sex;
    private String name;
    private String productList;
    private int totalAmount;
    private float totalPrice;

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product(String productCode, String productName,
                   float price, String userName, String name,
                   String productList, int totalAmount, float discount, float totalPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.userName = userName;
        this.name = name;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Product(String productCode, float price, float discount, int amount, String userName) {
        this.productCode = productCode;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.userName = userName;

    }


    public Product(String productCode, String productName, float price, float discount, int amount,
                   String supplier, String typeCode, int amountImport, int amountExport,
                   String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.supplier = supplier;
        this.typeCode = typeCode;
        this.amountImport = amountImport;
        this.amountExport = amountExport;
        this.description = description;
    }

    public Product(String productCode, String productName, float price,
                   float discount, int amount, String supplier, String typeCode,
                   String image, int amountImport, int amountExport, String description, String sex) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.supplier = supplier;
        this.typeCode = typeCode;
        this.image = image;
        this.amountImport = amountImport;
        this.amountExport = amountExport;
        this.description = description;
        this.sex = sex;
    }

    public Product() {
    }

    public Product(String productCode, String productName, float price, float discount, String supplier, String image) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.supplier = supplier;
        this.image = image;
    }

    public Product(String productCode, String productName,
                   float price, float discount, int amount, String supplier,
                   String typeCode, String image, int amountImport,
                   int amountExport, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.supplier = supplier;
        this.typeCode = typeCode;
        this.image = image;
        this.amountImport = amountImport;
        this.amountExport = amountExport;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAmountImport() {
        return amountImport;
    }

    public void setAmountImport(int amountImport) {
        this.amountImport = amountImport;
    }

    public int getAmountExport() {
        return amountExport;
    }

    public void setAmountExport(int amountExport) {
        this.amountExport = amountExport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
