package com.sber;

public class Moto extends Transport {
    public static class Builder {
        private Moto newMoto;

        public Builder() {
            newMoto = new Moto();
        }

        public Moto.Builder withVin(String vin) {
            newMoto.vin = vin;
            return this;
        }

        public Moto.Builder withSpeed(int speed) {
            newMoto.speed = speed;
            return this;
        }

        public Moto.Builder withHeight(float height) {
            newMoto.height = height;
            return this;
        }

        public Moto.Builder withWidth(float width) {
            newMoto.width = width;
            return this;
        }

        public Moto.Builder withLength(float length) {
            newMoto.length = length;
            return this;
        }

        public Moto.Builder withDate(String date) {
            newMoto.date = date;
            return this;
        }

        public Moto build() {
            System.out.println("Moto is created with params:");
            System.out.println("VIN: " + newMoto.vin);
            System.out.println("MaXSpeed: " + newMoto.speed + "km/h");
            System.out.println("Moto Height: " + newMoto.height + "mm");
            System.out.println("Moto Length: " + newMoto.length + "mm");
            System.out.println("Moto Width : " + newMoto.width + "mm");
            System.out.println("Moto Production Date: " + newMoto.date);
            return newMoto;
        }

    }
}