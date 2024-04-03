package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();

            if (radius > 0) {
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
            } else {
                System.out.println("Enter a positive number");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        input.close();
    }
}