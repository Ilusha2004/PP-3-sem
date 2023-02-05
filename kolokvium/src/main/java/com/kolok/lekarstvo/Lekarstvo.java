package com.kolok.lekarstvo;

public class Lekarstvo {
    private String Name;
    private int Year;
    private String NameManufactor;
    private int AmountBoxes;
    private Double PriceForOne;

    public Lekarstvo(String name, int year, String nameManufactor, int amountBoxes, Double priceForOne) {
        Name = name;
        Year = year;
        NameManufactor = nameManufactor;
        AmountBoxes = amountBoxes;
        PriceForOne = priceForOne;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getNameManufactor() {
        return NameManufactor;
    }

    public void setNameManufactor(String nameManufactor) {
        NameManufactor = nameManufactor;
    }

    public int getAmountBoxes() {
        return AmountBoxes;
    }

    public void setAmountBoxes(int amountBoxes) {
        AmountBoxes = amountBoxes;
    }

    public Double getPriceForOne() {
        return PriceForOne;
    }

    public void setPriceForOne(Double priceForOne) {
        PriceForOne = priceForOne;
    }

    @Override
    public String toString() {
        return "Lekarstvo [Name=" + Name + ", Year=" + Year + ", NameManufactor=" + NameManufactor + ", AmountBoxes="
                + AmountBoxes + ", PriceForOne=" + PriceForOne + "]";
    }

}
