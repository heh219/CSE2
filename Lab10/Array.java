////////////////////////////////////////////
/*Huang HE
Lab10
Array
Oct.30*/

//first compile this program
//    javac Array.java
//run this program
//    java Array

import java.util.Scanner;
//define a class
public class Array{
    //add a main method
    public static void main (String args[]){
        Scanner myScanner = new Scanner(System.in);
        //get random number between 5 and 10
        int StudentNumber = (int)(Math.random()*5)+5;
        //print title
        System.out.println("Enter "+StudentNumber+" student names: ");
        int number = StudentNumber;//define number
        String[] studentNames;//define array studentNames
        studentNames = new String[StudentNumber];//define array studentNames
        //require to input students' name
        for(int i=0;i<number;i++){
            studentNames[i] = myScanner.next();
        }
        int[] testScore = new int[StudentNumber];//define array testScore
        number = StudentNumber;
        //meke random score bwtween 0 to 100
        for(int i=0;i<number;i++){
            testScore[i] = (int)(Math.random()*100);
        }
        //print out result
        System.out.println("Here are the midtern grades of the "+StudentNumber+" students above: ");
        number = StudentNumber;
        for(int i=0;i<number;i++){
            System.out.println(studentNames[i]+": "+testScore[i]);
    }
    }
}