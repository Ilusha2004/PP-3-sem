package com.laba_6a.car;

public class Car {
    private Integer Position;
    private Integer Velocity;
    private String Color;
    private String Brand;

    public Car() {
        this.Position = 0;
        this.Velocity = 0;
        this.Brand = null;
        this.Color = null;
    }

    public Car(String brand, String color, Integer position, Integer velocity) {
        Position = position;
        Velocity = velocity;
        Color = color;
        Brand = brand;
    }


    public Integer getPosition() {
        return Position;
    }

    public Integer getVelocity() {
        return Velocity;
    }

    public void setPosition(Integer position) {
        Position = position;
    }

    public void setVelocity(Integer velocity) {
        Velocity = velocity;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Car [Position=" + Position + ", Velocity=" + Velocity + ", Color=" + Color + ", Brand=" + Brand + "]";
    }


}
