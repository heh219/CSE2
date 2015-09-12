////////////////////////////////////////////////////
//Huanghe
//Homework 03
//Time
//
//  first compile this program
//      javac Time.java
//  run the program
//      java Time

import java.util.Scanner;
//define a class
public class Time{
    // main mathod required for every java program
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter the curren time in the form HHMM: ");
        double currentTime = myScanner.nextDouble();
        System.out.print("enter the time that you will be eating dinner in the form HHMM: ");
        double dinnerTime = myScanner.nextDouble();
        int hours, minutes;//to store digits in hours and munites form
        hours=(int)((dinnerTime-currentTime)/100);//seperate HH part in HHMM form in Ten-digit
        minutes=(int)(dinnerTime-currentTime-hours*100);//seperate MM part in HHMM form in Ten-digit
        System.out.println("you have " + hours + " hours and " + minutes + " minutes until dinner");
    }//end of this method
}//end of class