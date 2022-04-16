import java.io.*;
import java.util.*;

public class Array {
  public static void main (String[] args){
    double[] a = {0, 1, 2, 3};
    powArray(a, 4);  
  }
  
  public static void powArray(double[] a, int pow){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) { 
      b[i] = Math.pow(a[i], pow);
    }
    System.out.println(Arrays.toString(b));
  }
}
