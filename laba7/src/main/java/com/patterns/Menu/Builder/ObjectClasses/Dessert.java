package com.patterns.Menu.Builder.ObjectClasses;

public class Dessert {
    private Integer amount;
    private String filling;
    private String mainPart;
    private String top;
    
    public Dessert(Integer amount, String filling, String mainPart, String top) {
        this.amount = amount;
        this.filling = filling;
        this.mainPart = mainPart;
        this.top = top;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getMainPart() {
        return mainPart;
    }

    public void setMainPart(String mainPart) {
        this.mainPart = mainPart;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    } 
}
