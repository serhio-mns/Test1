package com.sber;

public class Bus extends Transport {

    public static class Builder {
        private Bus newBus;

        public Builder() {
            newBus = new Bus();
        }

        public Builder withVin(String vin) {
            newBus.vin = vin;
            return this;
        }

        public Builder withSpeed(int speed) {
            newBus.speed = speed;
            return this;
        }

        public Builder withHeight(float height) {
            newBus.height = height;
            return this;
        }

        public Builder withWidth(float width) {
            newBus.width = width;
            return this;
        }

        public Builder withLength(float length) {
            newBus.length = length;
            return this;
        }

        public Builder withDate(String date) {
            newBus.date = date;
            return this;
        }

        public Bus build() {
            System.out.println("Bus is created with params:");
            System.out.println("VIN: " + newBus.vin);
            System.out.println("MaXSpeed: " + newBus.speed+ "km/h");
            System.out.println("Bus Height: " + newBus.height+"mm");
            System.out.println("Bus Length: " + newBus.length+"mm");
            System.out.println("Bus Width : " + newBus.width+"mm");
            System.out.println("Bus Production Date: " + newBus.date);
            return newBus;
        }

    }
}
