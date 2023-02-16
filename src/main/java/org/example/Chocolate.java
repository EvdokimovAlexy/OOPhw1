package org.example;
public class Chocolate extends Product {
    private String  type = "";
    public Chocolate(String name, Double price) {
        super(name, price);
    }
    public Chocolate(String name, Double price, String type) {
        this(name, price);
        this.type = type;
    }
    @Override
    public String toString(){
        return String.format("%s type = %s  " , super.toString(), type);
    }
}