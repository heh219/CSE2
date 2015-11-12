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
        boolean run = true;
        System.out.print("Enter 15 ints for finial grades in CSE2: ");
        for(int i=0;i<grades.length;i++){
            if(myScanner.hasNextInt()){                             //check if the input is integer
                grades[i]=myScanner.nextInt();                      //give each number of array value
                if(grades[i]<0||grades[i]>100){                     //check the array value
                    System.out.println("Integer you input are not between o and 100.");
                    run=false;
                    break;                                          //stop and print out
                }                                                   //end if statement
                if(i>0){                                            //check index value
                    if(grades[i]<grades[i-1]){                      //check whether the array is increasing trend
                        System.out.println("You should input value in an increasing trend");
                        run=false;
                        break;                                      //stop and print out
                    }                                               //end if statement
                    
                }//end if statement
                else{                                                   //check if input do not satisify above conditions
                run=run;
            }
                
            }                                                       //end if statement
            else if(!myScanner.hasNextInt()){                       //check the input if input is not integer
                System.out.println("Error! Your input are not integers!");
                run=false;
                break;                                              //stop and print out
            }
            
        
        }
        
        
        if(run==true){                                              //run if run is true
    
        System.out.print("Enter a grade to search for: ");          
        int search = myScanner.nextInt();
        binary(search,grades);                                      //use binary method
        Scrambled(grades);                                          //use scrambled method
        System.out.print("Enter a grade to search for: ");
        int search2 = myScanner.nextInt();                          
        linear(search2,grades);                                     //use linear method
        }                                                           //end if statement   
        
        
        
        
        
    }//end of main method
    
    //add a method to do linear search
    public static void linear(int key, int[] array){
        int iterations=0;                                           //initialize iterations
        int i=0;
        for(i=0; i<array.length;i++){  
            iterations++;
            if(array[i]==key){                                      //check if we find the key
                System.out.println(key+" was found in the list with "+iterations+" iterations.");
                break;
            }
        }
        if(i==array.length){                                        //we didn't find the key
                System.out.println(key+" was not found in the list with "+iterations+" iterations.");
            }
    }//end of linear search method
    
    //add a method to do binary search
    public static void binary(int key, int[] array){
        int low = 0;                                  
        int high = array.length-1;
        int middle;
        int iterations=0;
        while(low<=high){
            iterations++;
            middle = (low+high)/2;
            if(array[middle]==key){                                 //check if we find the key
                System.out.println(key+" was found in the list with "+iterations+" comparisons.");
                break;
            }
            else if(array[middle]>key){                             //change the value of high if condition satisfy
                high=middle;
            }
            else if(array[middle]<key){                             //change the value of low if condition satisfy
                low=middle;
            }
            
        }
        if(high<low){                                               //check if we didn't find the key
            System.out.println(key+" was not found in the list with "+iterations+" comparisons.");
            
        }
        
    }//end of binary method
    
    //add a method to scramble array
    public static void Scrambled(int[] array){
        System.out.println("Scrambled: ");
        int index;
        Random random = new Random();
        for(int i=array.length-1;i>0;i--){
            index = random.nextInt(i+1);
            int temp = array[index];
            array[index] = array[i];
            array[i]=temp;
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }//end of Scrambled method
    
    
    
    
    
}//end of class


