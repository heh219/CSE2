//////////////////////////////////////////////
/*He Huang
Homework 08
String Analysis
Oct.20*/

//first compile this program
//    javac StringAnalysis.java
//run this program
//    java StringAnalysis

import java.util.Scanner;
//define the class
public class StringAnalysis{
    //add a main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please input: ");
        String input = myScanner.next();
        int count = 0;//define count initially
        for(int i=0;i<input.length();i++){//input each unit of input
            if(Character.isLetter(input.charAt(i))){//check if each unit of input is leeter
                count++;//define count
            }
        }
        if(count!=input.length()){//check if the units of input are all letters
            while(check1(input)==false){//do the while loop when check1 is false
                System.out.println("Please enter valid string: ");
                input = myScanner.next();}//reinput input
            if(check1(input)==true){//check if check1 is ture
                System.out.println("This is a valid String.");
            }
        }
        
        else{
            while(check2(input)==false){//do while loop when check2 is false
                System.out.println("Please enter valid string: ");
                    input = myScanner.next();}//reinput input
            if(check2(input)==true){//check if check2 is true
                    System.out.println("This is a valid String.");
                }
                
        }
    }//end this method

    public static boolean check1(String input){
        boolean check1=false;//define check1 initially
        int count = 0;//define count to count number
        int count1 = 0;//define count to count letter
        for(int i=0;i<input.length();i++){//input each unit of input
            if(Character.isDigit(input.charAt(i))){//check if each input is digit
                count+=1;
            }
            else if(Character.isLetter(input.charAt(i))){//check if each input is letter
                count1 += 1;
            }
        }
        if(count>count1){//check the value of count and count1
            check1=true;
        }
        else{//check if above do not satisify
            check1=false;
        }
        return check1;//returen result
    }//end this method
    
    public static boolean check2(String input){//define another method
        boolean check2=true;//define boolean state first
        int count = 0;//input initial value to count
        for(int i=0;i<input.length();i++){//input each unit of input
            if(input.charAt(i)>'a'&&input.charAt(i)<'z'){//check if that each unit is valid
                count=count;
            }
            else{//check if above do not satisify
                count += 1;
            }
        }
        if(count==0){//check count condition
            check2=true;
        }
        else{//check if above constion do not satisified
            check2=false;
        }
        return check2;//return result
    }//end this method
    
    
    
    
}//end this class