package com.sber;

public class Car extends Transport {
    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Car.Builder withVin(String vin) {
            newCar.vin = vin;
            return this;
        }

        public Car.Builder withSpeed(int speed) {
            newCar.speed = speed;
            return this;
        }

        public Car.Builder withHeight(float height) {
            newCar.height = height;
            return this;
        }

        public Car.Builder withWidth(float width) {
            newCar.width = width;
            return this;
        }

        public Car.Builder withLength(float length) {
            newCar.length = length;
            return this;
        }

        public Car.Builder withDate(String date) {
            newCar.date = date;
            return this;
        }

        public Car build() {
            System.out.println("Car is created with params:");
            System.out.println("VIN: " + newCar.vin);
            System.out.println("MaXSpeed: " + newCar.speed + "km/h");
            System.out.println("Car Height: " + newCar.height + "mm");
            System.out.println("Car Length: " + newCar.length + "mm");
            System.out.println("Car Width : " + newCar.width + "mm");
            System.out.println("Car Production Date: " + newCar.date);
            return newCar;
        }

    }
}