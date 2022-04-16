import java.io.*;
import java.util.*;

public class Max {
  public static void main (String[] args){
    int[] a = {0, 5, 10, 8};
    System.out.println(indexOfMax(a));
  }

  public static int indexOfMax(int[] a){
    int max = a[0];
    int imax = 1;
    for (int i = 0; i < a.length; i++){
      if (a[i]> max){
        max = a[i];
        imax = i;
        }
    }
    return imax;
  }
}