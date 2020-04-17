package model;

public class Supplier {
    private String supplierCode;
    private String nameSupplier;
    private String address;
    private int phoneNumber;

    public Supplier() {
    }

    public Supplier(String supplierCode, String nameSupplier, String address, int phoneNumber) {
        this.supplierCode = supplierCode;
        this.nameSupplier = nameSupplier;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
