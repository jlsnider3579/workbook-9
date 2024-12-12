package com.pluralsight.NorthwindTradersSpringBoot;

public class Product {
    private int productId;
    private String String;
    private String category;
    private double price;

    public Product(int productId, java.lang.String string, java.lang.String category) {
        this.productId = productId;
        String = string;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public java.lang.String getString() {
        return String;
    }

    public java.lang.String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public java.lang.String toString() {
        return "NorthwindTradersSpringBoot.src.main.java.com.pluralsight.NorthwindTradersSpringBoot.Product{" +
                "productId=" + productId +
                ", String='" + String + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
