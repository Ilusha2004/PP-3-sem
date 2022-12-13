package com.patterns.Menu.Builder.ObjectClasses;

public class Coffee {
    private Double tempeture;
    private boolean is_sweet;
    private Integer strenght;
    private String typeCoffeeBeans;

    public Coffee(Double tempeture, boolean is_sweet, Integer strenght, String typeCoffeeBeans) {
        this.tempeture = tempeture;
        this.is_sweet = is_sweet;
        this.strenght = strenght;
        this.typeCoffeeBeans = typeCoffeeBeans;
    }

    public void setTempeture(Double tempeture) {
        this.tempeture = tempeture;
    }

    public void setIs_sweet(boolean is_sweet) {
        this.is_sweet = is_sweet;
    }

    public void setStrenght(Integer strenght) {
        this.strenght = strenght;
    }

    public void setTypeCoffeeBeans(String typeCoffeeBeans) {
        this.typeCoffeeBeans = typeCoffeeBeans; 
    }

    public Double getTempeture() {
        return tempeture;
    }

    public boolean isIs_sweet() {
        return is_sweet;
    }

    public Integer getStrenght() {
        return strenght;
    }

    public String getTypeCoffeeBeans() {
        return typeCoffeeBeans;
    }

} 
