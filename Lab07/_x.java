///////////////////////////////////////////////////////
/*He Huang
Lab 07
_x.java
Oct. 9*/

//first compile the program
//    javac _x.java
//run this program
//    java _x.java

import java.util.Scanner;
//define a class
public class _x{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Plsease enter an inter between 0-100 to define the size of square: ");
        String Input = myScanner.next();
        
        
    int l=1;
    int n=0;
    int x=1;
    while(l==1){
         n=0;
         x=1;
        while(x==1){//check condition of inner while loop
               for (int i =0;i<Input.length();i++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(Input.charAt(i))){//check condition
                  n++;}//define n and end if function
                 else{//check is above condition is not satisified
                  n=n;//define n
            }}//end if function and for loop
            if (n!=0){//check condition of count variables n
            System.out.print("Sorry, you did not enter an integer. Try again: ");//print if above condition satisified
                Input=myScanner.next();//input string
                x=1;//define x
                n=0;
            }//define n and end if function
            else{
             int o=0;
             while(o==0){
             double i=Double.parseDouble(Input);//convert string into double
             if(i<0||i>100||i-(int)i!=0){//check double condition
                System.out.print("Please enter positive intgral number: ");//print result
               Input=myScanner.next();
               x=1;
               }
            else{
                x--;
            }
            o--;
        }
            }
    }
    l--;
    }
       int i=Integer.parseInt(Input);
        
       for(int m=0;m<(i+1);m++){
           
           for(int k=0;k<(i+1);k++){
               if(k==i-m){
                   System.out.print(" ");
               }
               else if(k==m){
                   System.out.print(" ");
               }
               else{
               System.out.print("*");
               }
           }
           System.out.println(" ");
       }
       
       
       
       
        
    }
}