//Adrian Sucahyo - 2020 - 3A
//Sphape Volume and Surface Area Calculator

import java.util.Scanner;

public class ShapeTester {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Sphere s1 = new Sphere();
    Box b1 = new Box();
    Pyramid p1 = new Pyramid();

    boolean loopA = true;
    String input;

    while (loopA) {

      boolean loopB = true;
      int shape = -1;
        while (loopB) {
          System.out.println("What shape? (Sphere, Cube, Pyramid)");
          input = scanner.nextLine();
          if (input.equals("sphere") || input.equals("Sphere")) {
            shape = 0;
            loopB = false;
          } else if (input.equals("cube") || input.equals("Cube")) {
            shape = 1;
            loopB = false;
          } else if (input.equals("pyramid") || input.equals("Pyramid")) {
            shape = 2;
            loopB = false;
          } else {
            System.out.println("Not possible. Try Again.");
          }
        }

      boolean loopC = true;
      float radius = 0;
      float length = 0;
      float width = 0;
      float height = 0;
      if (shape == 0) {
        loopC = true;
        while (loopC) {
          System.out.println("What is the radius \'r\' of the Sphere?");
          input = scanner.nextLine();
          try {
            radius = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        s1.set(radius);
        System.out.println("The volume of a Sphere with a radius of \n \t" + radius + "\nis \n \t" + s1.volume() + "\n");
        System.out.println("The surface area of a Sphere with a radius of \n \t" + radius + "\nis \n \t" + s1.surfaceArea() + "\n");


      } else if (shape == 1) {

        loopC = true;
        while (loopC) {
          System.out.println("What is the length \'l\' of the Cube?");
          input = scanner.nextLine();
          try {
            length = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        loopC = true;
        while (loopC) {
          System.out.println("What is the width \'w\' of the Cube?");
          input = scanner.nextLine();
          try {
            width = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        loopC = true;
        while (loopC) {
          System.out.println("What is the height \'h\' of the Cube?");
          input = scanner.nextLine();
          try {
            height = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        b1.set(length, width, height);
        System.out.println("The volume of a Cube with a length of \n \t" + length + "\nand a width of \n \t" + width + "\nand a height of \n \t" + height + "\nis \n \t" + b1.volume() + "\n");
        System.out.println("The surface area of a Cube with a length of \n \t" + length + "\nand a width of \n \t" + width + "\nand a height of \n \t" + height + "\nis \n \t" + b1.surfaceArea() + "\n");


      } else if (shape == 2) {
        loopC = true;
        while (loopC) {
          System.out.println("What is the length \'l\' of the Pyramid?");
          input = scanner.nextLine();
          try {
            length = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        loopC = true;
        while (loopC) {
          System.out.println("What is the width \'w\' of the Pyramid?");
          input = scanner.nextLine();
          try {
            width = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        loopC = true;
        while (loopC) {
          System.out.println("What is the height \'h\' of the Pyramid?");
          input = scanner.nextLine();
          try {
            height = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
            System.out.println("Not a number, try again");
            loopC = true;
          }
        }
        p1.set(length, width, height);
        System.out.println("The volume of a Pyramid with a length of \n \t" + length + "\nand a width of \n \t" + width + "\nand a height of \n \t" + height + "\nis \n \t" + p1.volume() + "\n");
        System.out.println("The surface area of a Pyramid with a length of \n \t" + length + "\nand a width of \n \t" + width + "\nand a height of \n \t" + height + "\nis \n \t" + p1.surfaceArea() + "\n");

      }

      System.out.println("Again? (y/n)");
      input = scanner.nextLine();
      if(input.equals("n") || input.equals("N")){
          loopA = false;
      }
    }
  }
}
