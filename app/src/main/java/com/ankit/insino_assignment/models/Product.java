package com.ankit.insino_assignment.models;



public class Product {
    private String imageResourceId;
    private String productName;
    private String productPrice;
    private boolean isLoading = false;
    private String category;
    private String designer;



    public Product(String imageResourceId, String productName, String productPrice, String category, String designer) {
        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
        this.designer = designer;
    }

    public Product() {
    }

    public String getCategory() {
        return category;
    }

    public String getDesigner() {
        return designer;
    }

    public String getImageResourceId() {
        return imageResourceId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
    }
}
