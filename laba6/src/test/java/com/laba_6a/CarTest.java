package com.laba_6a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.laba_6a.car.Car;

public class CarTest {

    private Car car = new Car();
    private Car car_1 = new Car();
    
    @Before
    public void setUp() {
        car = new Car(null, null, null, null);
    }

    @Test
    public void CarTestSetters() {
        car.setBrand("audi");
        car.setPosition(12.3d);
        car.setVelocity(56.4);
        assertEquals(car, new Car(12.3d, 56.4d, "audi", null));
    }

    @Test
    public void CarTestRapid() {
        car.IncreaseRapids(12.3d);
        assertEquals(car, new Car(12.3d, 56.4d, "audi", 12.3d));
    }

    @Before
    public void settingUp() {
        car_1 = new Car(2.3, 3.4, "dsf", null);
    }

    @Test
    public void CarsTest() {
        assertFalse(car == car_1);
    }

}
