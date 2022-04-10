import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      Scanner in = new Scanner(System.in);
      int user_guess;
      int difference;
      System.out.println("I'm thinking of a number from 1 to 100");
      System.out.println("(including both) Can you guess what it is?");
      System.out.print("Type a number: " );
      user_guess =  in.nextInt();

      if (user_guess > 100 ){
        System.out.println("No, Silly! Try Again");
        }
      else {
      System.out.println("Your guess is: " + user_guess);
      
      System.out.println("The number I was think of is: " + number);
      if (number >= user_guess) {
        difference = number - user_guess;
      }
      else {
        difference = user_guess - number;
      }

      System.out.println("You were off by: " + difference);
      }
      }
}