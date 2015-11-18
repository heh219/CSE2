//////////////////////////////////////
/*Huang He
Homework 12
Transpose
Nov. 16*/

//first compile this program
//    javac Transpose.java
//run the program
//    java Transpose

import java.util.Scanner;
//define a class
public class Transpose{
     public static void main (String args[]){
    //add a main method
     Scanner myScanner = new Scanner(System.in);
     System.out.print("Enter the width of the array: ");
     int width = myScanner.nextInt();
     System.out.print("Enter the height of the array: ");
     int height = myScanner.nextInt();
     int[][] array=randomMatrix(width,height);
     
     printMatrix(array,width,height);
     
     int[][] transpose=transposeMatrix(array,width,height);
     printMatrix(transpose,height,width);
     int[] data = askAgain();
     int inputWidth = data[0];
     int inputLength = data[1];
     int[][] array2=randomMatrix(inputWidth,inputLength);
     printMatrix(array2,inputWidth,inputLength);
     int[][] transpose2=transposeMatrix(array2,inputWidth,inputLength);
     printMatrix(transpose2,inputLength,inputWidth);
     
     
    
    
     } 
     
     //add a method to generate random two dimensional array
     public static int[][] randomMatrix(int width, int height){
         int[][] array = new int[width][height];                   //define initial size of array
         
         for(int i=0;i<height;i++){                                //using two for loop to give each member of the array value
             
             for(int j=0;j<width;j++){
                 int value = (int)(Math.random()*10)-10;           //random number from -10-10
                 array[j][i] = value;
                 
             }
             
         }
         return array;
     }//end of this method
     
     //add a method to print out array
     public static void printMatrix(int[][] array,int width,int height){
         System.out.println("The array: ");
         for(int i=0;i<height;i++){                                 //using two for loop to print each member in the array
             for(int j=0;j<width;j++){
                 System.out.print(array[j][i]+" ");
             }
             System.out.println("");
         }
     }//end of this method
     
     //add a method to transpose that two dimensinal array
     public static int[][] transposeMatrix(int[][] array,int width,int height){
         System.out.println("After transpose ");
         int[][] transpose = new int[height][width];                //switch width and height to generate new form of array
         for(int i=0;i<height;i++){
             for(int j=0;j<width;j++){
                 transpose[i][j] = array[j][i];
             }
             
         }
         return transpose;
     }//end of this method
     
     //add a method to require user input again
     public static int[] askAgain(){
        
        int[] number = new int[2];
        System.out.print("Please enter the width of array: ");
        Scanner width = new Scanner(System.in);
        while(!width.hasNextInt()){                                 //ask user input again if input is not integer
            System.out.print("Try again! Enter integer! Please enter the width of array: ");
              width.next();
             
        }
        int w = width.nextInt();                                    //define array number value
        number[0]=w;
        
        System.out.print("Please enter the length of array: ");
        Scanner length = new Scanner(System.in);
        while(!length.hasNextInt()){                                //ask user input again if input is not integer
            System.out.print("Try again! Enter integer ! Please enter the width of array: ");
             length.next();
            
        }
        int l = length.nextInt();                                   //define array number value
        number[1]=l;
        return number;
     }//end of this method
     
     
}//end of this class