import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
    int hour , minute , second;
    hour = 16;
    minute = 30;
    second = 05;
    //PART1
    int sec_since_midnight = ((hour*60)*60)+(minute*60) + second;
    System.out.println("Seconds since midnight = " + sec_since_midnight);
    //PART2
    int sec_in_day = 24*60*60;
    System.out.println("Seconds left in the day = " + (sec_in_day -sec_since_midnight ));
    //Part3
    System.out.printf("Percentage of the day that has passed = %.1f%s \n" , (((double)sec_since_midnight *100 / sec_in_day)), "%");
    //Part4
    hour = 16;
    minute = 40;
    second = 59;
    int new_sec_since_midnight = ((hour*60)*60)+(minute*60) + second;
    System.out.print("Time to complete this exercise = ");
    System.out.println(new_sec_since_midnight - sec_since_midnight);
    }
}