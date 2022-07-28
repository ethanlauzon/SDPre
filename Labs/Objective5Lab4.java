import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    System.out.println("Please enter a number: ");
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();

    if(num % 2 == 0){
    System.out.println("The number is even");
    }

    else{
      System.out.println("The number is odd");
    }



    kb.close();






  }
}
