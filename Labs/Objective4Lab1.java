import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

      Scanner key = new Scanner(System.in);

      System.out.println("What is your first name?");
      String fname = key.nextLine();
      System.out.println("What is your last name?");
      String lname = key.nextLine();


      System.out.println("What is your favorite animal?");
      String favoriteAnimal = key.nextLine();


      System.out.println("What is your favorite food?");
      String favoriteFood = key.nextLine();


      System.out.println("What is your favorite song?");
      String favoriteSong = key.nextLine();

      System.out.println("My name is " + fname + " " + lname);
      System.out.println("My favorite animal is the " + favoriteAnimal);
      System.out.println("My favorite food is " + favoriteFood);
      System.out.print("My favorite song is " + favoriteSong);

       key.close();
    }
}
