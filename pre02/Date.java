import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
      String day = "Saturday";
      String month = "April";
      int date = 9;
      int year = 2022;
      System.out.println("American Format:");
      System.out.println(day + ", " + month + " " + date + ", " + year);
      System.out.println("European Format:");
      System.out.println(day + " " + date + " " + month + " " + year);
    }
}