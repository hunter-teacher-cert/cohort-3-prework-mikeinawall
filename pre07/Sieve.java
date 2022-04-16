import java.io.*;
import java.util.*;

public class Sieve {
  public static void main (String[] args){
    int n = 30;
    Sieve(n);
  }

  public static void Sieve(int n){
    boolean[] boollist = new boolean[n];
    for (int i = 0; i < n; i++){
      boollist[i] = true;
    }
    boollist[0] = false;
    boollist[1] = false;
    boollist[2] = true;
    for (int i = 3; i < n; i++){
      //runs each value from 2 to n
      for (int m = 2; m < i; m++){
        //divides each value by all of the previous values
        if (i % m == 0){
          boollist[i] = false;
        }
      }
    }
    System.out.println(Arrays.toString(boollist));
  }
}  