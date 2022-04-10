import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
      double c , f;
      Scanner in = new Scanner(System.in);

      System.out.print("What is the temperature in Celcius? ");
      c = (double) in.nextDouble();

      f = (1.8 * c + 32);

      System.out.printf("Here is what it is in Farenheight! %.1f \n", f);
      }
}