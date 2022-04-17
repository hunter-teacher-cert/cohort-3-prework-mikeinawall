import java.io.*;
import java.util.*;

public class Craps {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("How many rounds would you like to play?");
    int numRounds = in.nextInt();
    for (int i = 0; i < numRounds; i++){
      System.out.println("Round " + (i+1) + ":");
      round();
    }  
  }

  public static void round(){
    int shot = shoot(2, 6);
    if (shot == 2 || shot == 3 || shot == 12){
      System.out.println("   You rolled a " + shot + " which is Craps so you lose");
    }else if (shot == 7 || shot == 11){
      System.out.println("   You rolled a " + shot + " which is a Natural so you win");
    } 
    else {
      System.out.println("   You rolled a " + shot + " so that is the Point");
      int secshot = shoot(2, 6);
      while (secshot != shot && secshot != 7){
        System.out.println("   You rolled a " + secshot + " which is not the Point or 7 so you must roll again");
        secshot = shoot(2, 6);
      }
      
      if (secshot == shot ){
        System.out.println("   You rolled an " + secshot + " which is the Point so you win");
      }
      else if( secshot == 7){
        System.out.println("   You rolled a 7 so you lose");
      }
    }
  }
  
  public static int roll(int sides){
    Random random = new Random();
    int number = random.nextInt(sides) + 1;
    //System.out.println(number);
    return number;
  }

  public static int shoot(int dice, int sides){
    int total = 0;
    for(int i = 0; i < dice; i++){
      total = total + roll(sides);
      }
    //System.out.println(total);
    return total; 
  }
}  