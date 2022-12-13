package com.patterns.Menu.Builder.ObjectClasses;

public class Table {
    private Integer numberTable;
    private Integer amountOfTable;
    
    public Table(Integer numberTable, Integer amountOfTable) {
        this.numberTable = numberTable;
        this.amountOfTable = amountOfTable;
    }

    public Integer getNumberTable() {
        return numberTable;
    }

    public void setNumberTable(Integer numberTable) {
        this.numberTable = numberTable;
    }

    public Integer getAmountOfTable() {
        return amountOfTable;
    }

    public void setAmountOfTable(Integer amountOfTable) {
        this.amountOfTable = amountOfTable;
    }
    
    
}
