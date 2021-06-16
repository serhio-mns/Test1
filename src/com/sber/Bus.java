package com.sber;

public class Bus extends Transport {
    public Bus(String vin, String speed) {
        super(vin, speed);
    }

    public void display() {
        System.out.println("Bus is created with params:");
        System.out.println("VIN: " + this.vin);
        System.out.println("Speed: " + this.speed);
    }
}
