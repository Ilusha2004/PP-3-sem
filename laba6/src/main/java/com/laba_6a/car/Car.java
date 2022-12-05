package com.laba_6a.car;

public class Car implements Comparable<Car>{
    protected Double Position;
    private Double Velocity;
    private String Brand;
    private Double LastRapid;

    public Car(Double position, Double velocity, String brand, Double lastRapid) {
        Position = position;
        Velocity = velocity;
        Brand = brand;
        LastRapid = lastRapid;
    }

    public Car() {
        this.LastRapid = null;
        this.Position = 0.0d;
        this.Velocity = 0.0d;
        this.Brand = null;
    }

    public int compareTo(Car temp) {
        return (int) (this.getRaInteger() - temp.getRaInteger());
    }

    public void IncreaseRapids(Double time) {
        this.LastRapid = time;
    }

    public Double getPosition() {
        return Position;
    }

    public Double getVelocity() {
        return Velocity;
    }

    public void setPosition(Double position) {
        Position = position;
    }

    public void setVelocity(Double velocity) {
        Velocity = velocity;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Double getRaInteger() {
        return LastRapid;
    }

    @Override
    public String toString() {
        return "Car [Position=" + Position + 
               ", Velocity=" + Velocity + 
               ", Brand=" + Brand + 
               ", LastRapid=" + LastRapid
         + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((LastRapid == null) ? 0 : LastRapid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (LastRapid == null) {
            if (other.LastRapid != null)
                return false;
        } else if (!LastRapid.equals(other.LastRapid))
            return false;
        return true;
    }
    
}
