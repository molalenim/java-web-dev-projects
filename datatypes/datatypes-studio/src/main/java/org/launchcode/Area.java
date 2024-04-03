package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius >= 0) { // Changed to greater than or equal to zero
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
            } else {
                System.out.println("Enter a non-negative number");

                input.close();
            }

        }
    }
}