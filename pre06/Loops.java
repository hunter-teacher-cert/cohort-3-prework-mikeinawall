import java.io.*;
import java.util.*;

public class Loops {
  public static void main (String[] args){
    printSqrt( 420 , 20);
    printPower(8, 4);
    printFactorial(3);
    printFactorial(7);
  }  

  public static void printFactorial( int x){
    int factorial = 1;
    while(x >= 1){
      factorial = factorial * x;
      x = x - 1;
    } 
    System.out.println(factorial);
  }
  
  public static void printPower(int x, int n){
    //Method for Exercise #3
    int i = 1;
    int newx = x;
      while (i < n){
        newx = newx * x;
        i = i + 1;   
      }
    System.out.println(newx);
  }
  
  public static void printSqrt(double num, double guess){
    //Method for Exercise #4
    double nextguess;
    double difference = 1.0;
    System.out.println("Your guess for the square root of " + num + " is " + guess);
    do {
      nextguess = (guess + (num/guess))/2;
      System.out.println(nextguess);
      difference = Math.abs(nextguess - guess);
      guess = nextguess; 
    } while (difference > 0.001);
  }
}
  