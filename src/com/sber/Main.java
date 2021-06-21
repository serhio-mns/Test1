package com.sber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Noob Transport Tycoon v.1.0.");
        System.out.println("You can only create 3 types of Transport: Bus, Moto and Car (lol)");
        System.out.print("Let's start with the Transport Type. What do you like? Type it here: ");
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();


        if (type.equalsIgnoreCase("BUS") || type.equalsIgnoreCase("MOTO") || type.equalsIgnoreCase("CAR")) {
            MainBuilder qwe = new MainBuilder.builder()
                    .transportBuilder(type);
            in.close();
        } else System.out.println("---It is a FAIL! Try one more time! -" + type + "- is not a Transport");
    }
}
