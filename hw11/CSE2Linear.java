//////////////////////////////////
/*Huang He
Homework 11
CSE2Linear
Nov.8*/

//first compile this program
//    javac CSE2Linear.java
//run this program
//    java CSE2Linear

import java.util.Scanner;
import java.util.Random;
//define a class
public class CSE2Linear{
    //add a main method
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        int[] grades = new int[15];
        System.out.print("Enter 15 ints for finial grades in CSE2: ");
        for(int i=0;i<grades.length;i++){
            if(myScanner.hasNextInt()){
                grades[i]=myScanner.nextInt();
                if(grades[i]<0||grades[i]>100){
                    System.out.println("Int not between o and 100.");
                    System.exit(1);
                }
                
            }
            else{
                System.out.println("Error! Your input are not integers!");
                System.exit(1);
            }
        }
        System.out.println("Sorted: ");
        int[] newArray = sort(grades);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        int search = myScanner.nextInt();
        linear(search,grades);
        Scrambled(grades);
        System.out.print("Enter a grade to search for: ");
        int search2 = myScanner.nextInt();
        linear(search2,grades);
        
        
        
    }
    
    
    public static void linear(int key, int[] array){
        int iterations=0;
        int i=0;
        for(i=0; i<array.length;i++){  
            iterations++;
            if(array[i]==key){
                System.out.println(key+" was found in the list with "+iterations+" iterations.");
                break;
            }//end if statment
        }//end for statment
        if(i==array.length){
                System.out.println(key+" was not found in the list with "+iterations+" iterations.");
            }//end else if statement
    }//end linear search method

    public static void Scrambled(int[] array){
        System.out.println("Scrambled: ");
        for(int i=0;i<array.length;i++){
            int x=(int)(Math.random()*15);
            int temp=array[x];
            array[x]=array[i];
            array[i]=temp;
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        return;
    }
    
    public static int [] sort(int[] array) {
        int[] sorted = array;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                if ( (sorted[i] > sorted[j]) && (i != j) ) {
                    int temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
                
            }
        }
        
        return sorted;
    }
}


