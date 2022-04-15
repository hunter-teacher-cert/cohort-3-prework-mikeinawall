import java.io.*;
import java.util.*;

public class Methods {
  public static void main (String[] args){
    int x = 4;
    int y = 8;
    int z = 15;
    int a = 11;
    isDivisible( x, y);
    isDivisible( y, x);
    isTriangle(x,y,z);
    isTriangle(a,x,y);
    System.out.println(ack(3, 4));
    
  }

  public static boolean isDivisible( int n , int m){
    if ((n % m) == 0){
      System.out.println("Yes it is!");
      return true;
    }else {
      System.out.println("No it is not!");
      return false; 
    }
  }

  public static int ack( int m , int n){
    if (m == 0){
      return n+1;
    }else if (m>0 && n == 0){
      return ack(m-1, 1);
    }else{
      return ack(m-1, ack(m, n-1));
    }
  }
  
  public static boolean isTriangle( int x, int y , int z ){
    if (x >= y && x >= z) {
      if (x <= (y+z)){
        System.out.println("yea it will triangle");
        return true;
      }else{
         System.out.println("no it will not triangle");
        return false;
        }
    }
    if (y >= x && y >= z) {  
      if (y <= (x+z)){
        System.out.println("yea it will triangle");
        return true;
      }else{
         System.out.println("no it will not triangle");
        return false;
        }
    }
    else {  
      if (z <= (x+y)){
        System.out.println("yea it will triangle");
        return true;
      }else{
         System.out.println("no it will not triangle");
        return false;
        }
    }
  }
}