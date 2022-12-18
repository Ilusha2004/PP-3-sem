package com.patterns.Menu.Builder.ObjectClasses;

public class Dessert {

    private String filling;
    private String mainPart;
    private String top;
    
    public Dessert(String filling, String mainPart, String top) {
        this.filling = filling;
        this.mainPart = mainPart;
        this.top = top;
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

    @Override
    public String toString() {
        return "(filling=" + filling + ", mainPart=" + mainPart + ", top=" + top + ")";
    } 

}
