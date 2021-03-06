/////////////////////////////////////////////////
/*Huang he
HomeWork 06
CheckDigit
Oct. 5*/

//first compile this program
//    javac BarGraph.java
//run this program
//    java BarGraph

import java.util.Scanner;
//define a class
public class CheckDigit{
    //add a main mathod
    public static void main (String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Please enter a 10 digit barcode: ");
        String Code = myScanner.next();
        char character;
        int digit, sum=0, k=10;
        while(Code.length()!=10){//check the code length
            System.out.print("Please enter 10 digits: ");
            Code = myScanner.next();
        }
        
        for (int i=0;i<9;i++){//check whether the code contains letter
            if(Character.isLetter((Code.charAt(i)))){
            System.out.println("This is NOT a valid ISBN.Please enter 10 digits:");
            Code = myScanner.next();
             }
            }
        
        for(int i=0; i<(Code.length()-1); i++){//calculate the sum to verify the validity of the code
            character=Code.charAt(i);
            
            if(character=='X'){
                digit=10;
            }
            else{
                digit=character-48;//convert character into interger
                
            }
            sum=sum+digit*k;
            k--;
    
        }
        
            int check = sum % 11;//define check
            
            //find check digit in code
            int checkDigit=0;
            if(!Character.isLetter(Code.charAt(9))){
            checkDigit = Code.charAt(9)-48;}
            else if(Code.charAt(9)=='X'){
            checkDigit=10;}
            
 
            if(checkDigit == check){//check the correct condition
            System.out.println("This is a valid ISBN.");
            }
            else if(0<check &&check <10){//print check of incorrect code
            System.out.println("This is NOT a valid ISBN.Check digit should be " + check);
            }
            else if(check==10){//print check of incorrect code
                System.out.println("This is NOT a valid ISBN. Check digit should be X");
            }
            

        
    
        
         
         
         
        }
    }
