package com.sber;

import java.util.Scanner;

public class MainBuilder {
    public static class builder {
        public Bus newBus;
        public Car newCar;
        public Moto newMoto;
        Scanner in = new Scanner(System.in);

        public MainBuilder transportBuilder(String type) {

            //Читаем с консольки
            System.out.print("Ok, now please set VIN for new " + type + ": ");
            String vin = in.nextLine();
            System.out.print("Set Date Of Issue for the new " + type + ": ");
            String dat = in.nextLine();
            System.out.print("Set Max Speed for the new " + type + ": ");
            int speed = in.nextInt();
            System.out.print("Set Height for the new " + type + ": ");
            float height = in.nextFloat();
            System.out.print("Set Width for the new " + type + ": ");
            float width = in.nextFloat();
            System.out.print("Set Length for the new " + type + ": ");
            float length = in.nextFloat();
            System.out.println("Here it Is! It's magic! Brand new " + type + " is created! Enjoy ");
            System.out.println("--------------------");
            in.close();

            //---------------------------
            if (type.equalsIgnoreCase("BUS")) {
                Bus newBus = new Bus.Builder()
                        .withVin(vin)
                        .withSpeed(speed)
                        .withHeight(height)
                        .withWidth(width)
                        .withLength(length)
                        .withDate(dat)
                        .build();
            } else if (type.equalsIgnoreCase("CAR")) {
                Car newCar = new Car.Builder()
                        .withVin(vin)
                        .withSpeed(speed)
                        .withHeight(height)
                        .withWidth(width)
                        .withLength(length)
                        .withDate(dat)
                        .build();
            } else if (type.equalsIgnoreCase("MOTO")) {
                Moto newCar = new Moto.Builder()
                        .withVin(vin)
                        .withSpeed(speed)
                        .withHeight(height)
                        .withWidth(width)
                        .withLength(length)
                        .withDate(dat)
                        .build();
            } else
                System.out.println("Unknown shit happens");
            return null;
        }
    }
}
