package org.example;
public class CursedProducts extends Product {
    private final Integer longevity;
    public CursedProducts(String name, Double price, Integer longevity) {
        super(name, price);
        this.longevity = longevity;
    }
    @Override
    public String toString(){
        return String.format("%s longevity = %d  " , super.toString(), longevity);
    }
}