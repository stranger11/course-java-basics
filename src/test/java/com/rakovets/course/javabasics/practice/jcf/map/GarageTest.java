package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.map.garage.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class GarageTest {

    @Test
    void testGarage() {
        Garage garage = new Garage();
        garage.park(new Sedan("Volvo", "S80", "black", 2010, "7693 PM-7"));
        garage.park(new SportCar("Ferrari", "Enzo", "white", 2008, "7777 XA-7"));
        garage.park(new SportCar("Aston Martin", "DB-10", "grey", 2019, "7777 PM-8"));
        garage.park(new Coupe("BMW", "4", "yellow", 2016, "1895 PM-8"));
        garage.park(new Pickup("Toyota", "Tundra", "black", 2015, "2356 AB-6"));
        assertEquals(1, garage.getCount("BMW", "4"));
        assertTrue(garage.isExist("1895 PM-8"));
        assertFalse(garage.isExist("7778 PM-4"));
        assertTrue(garage.isExist("Volvo", "S80", "7693 PM-7"));
        assertFalse(garage.isExist("Audi", "a4", "4353 AV-8"));
        garage.leave(new Pickup("Toyota", "Tundra", "black", 2015, "2356 AB-6"));
        assertTrue(garage.isExist("2356 AB-6"));
        assertEquals("brand: Aston Martin, model: DB-10, color: grey, yearManufacture: 2019, registrationNumber: 7777 PM-8", garage.getByRegistrationNumber("7777 PM-8").toString());
        assertEquals("DB-10", garage.getByRegistrationNumber("7777 PM-8").getModel());
        assertEquals(2019, garage.getByRegistrationNumber("7777 PM-8").hashCode());
        assertFalse(garage.getByRegistrationNumber("7777 XA-7").equals(garage.getByRegistrationNumber("2356 AB-6")));
    }
}

