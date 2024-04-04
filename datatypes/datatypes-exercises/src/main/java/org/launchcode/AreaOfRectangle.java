package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double myRectangleLength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double myRectangleWidth = scanner.nextDouble();

        Double area = myRectangleLength * myRectangleWidth;

        System.out.println("Your area is: " + area.toString());
        scanner.close();

    }

}
