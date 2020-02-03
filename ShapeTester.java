import java.util.Scanner;

public class ShapeTester {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
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
            loopC = true;
          }
        }
        Sphere s1 = new Sphere(radius);
        System.out.println("The volume of a Sphere with a radius of " + radius + " is " + s1.volume());
        System.out.println("The surface area of a Sphere with a radius of " + radius + " is " + s1.surfaceArea());


      } else if (shape == 1) {
        loopC = true;
        while (loopC) {
          System.out.println("What is the length \'l\' of the Cube?");
          input = scanner.nextLine();
          try {
            length = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
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
            loopC = true;
          }
        }
        Box b1 = new Box(length, width, height);
        System.out.println("The volume of a Cube with a length of " + length + " and a width of " + width + " and a height of " + height + " is " + b1.volume());
        System.out.println("The surface area of a Cube with a length of " + length + " and a width of " + width + " and a height of " + height + " is " + b1.surfaceArea());


      } else if (shape == 2) {
        loopC = true;
        while (loopC) {
          System.out.println("What is the length \'l\' of the Pyramid?");
          input = scanner.nextLine();
          try {
            length = Float.parseFloat(input);
            loopC = false;
          } catch(NumberFormatException e){
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
            loopC = true;
          }
        }
        Pyramid p1 = new Pyramid(length, width, height);
        System.out.println("The volume of a Pyramid with a length of " + length + " and a width of " + width + " and a height of " + height + " is " + p1.volume());
        System.out.println("The surface area of a Pyramid with a length of " + length + " and a width of " + width + " and a height of " + height + " is " + p1.surfaceArea());

      }

      System.out.println("Again? (y/n)");
      input = scanner.nextLine();
      if(input.equals("n") || input.equals("N")){
          loopA = false;
      }
    }
  }
}
