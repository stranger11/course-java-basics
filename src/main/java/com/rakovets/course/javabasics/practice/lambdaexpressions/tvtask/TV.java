package com.rakovets.course.javabasics.practice.lambdaexpressions.tvtask;

public class TV {
    private String manufacturer;
    private String model;
    private int yearOfIssue;
    private int diagonal;
    private double price;

    public TV(String manufacturer, String model, int yearOfIssue, int diagonal, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "manufacturer: " + manufacturer + "\n" + "model: " + model + "\n" +
                "year of issue: " + yearOfIssue + "\n" +
                "diagonal: " + diagonal + "\n" +
                "price: " + price + "\n";
    }
}
