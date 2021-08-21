package bai17_BinaryFileAndSerialization.bai_tap.ProductManagement;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String productName;
    private String manufacturer;
    private String cost;
    private String otherDescription;

    public Product(String productCode, String productName, String manufacturer, String cost, String otherDescription) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.otherDescription = otherDescription;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public String toString() {
        return getProductCode() + "," +
                getProductName() + "," +
                getManufacturer() + "," +
                getCost() + "," +
                getOtherDescription();
    }
}
