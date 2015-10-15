////////////////////////////////////////////
/*Huang he
homework 06
Twisty!
Oct. 14*/

import java.util.Scanner;
//define a class
public class Twisty{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input your desired length: ");
        String Input = myScanner.next();
        
    int l=1;
    int n=0;
    int x=1;
    while(l==1){//do this while loop when l is 1
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
            System.out.println(" Error: please type in an interger.");//print if above condition satisified
            System.out.print("Input your desired length: ");
                Input=myScanner.next();//input string
                x=1;//define x
                n=0;
            }//define n and end if function
            else{
             int o=0;
             while(o==0){
             double L=Double.parseDouble(Input);//convert string into double
             if(L<0||L-(int)L!=0){//check double condition
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
       int L=Integer.parseInt(Input);//convert i into int
       
       System.out.print("Input your desired width: ");
       String Width = myScanner.next();
       l=1;
       n=0;
       x=1;
    while(l==1){
         n=0;
         x=1;
        while(x==1){//check condition of inner while loop
               for (int a =0;a<Width.length();a++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(Width.charAt(a))){//check condition
                  n++;}//define n and end if function
                 else{//check is above condition is not satisified
                  n=n;//define n
            }}//end if function and for loop
            if (n!=0){//check condition of count variables n
            System.out.println(" Error: please type in an interger.");
            System.out.print("Input your desired width:  ");//print if above condition satisified
                Width=myScanner.next();//input string
                x=1;//define x
                n=0;
            }//define n and end if function
            else{
             int o=0;
             while(o==0){
             double w=Double.parseDouble(Width);//convert string into double
             if(w<0||w-(int)w!=0){//check double condition
                System.out.print("Please enter positive intgral number: ");//print result
               Width=myScanner.next();
               x=1;
               }
               else if(w>=L){
                   System.out.println(" Error: Please input an integer smaller than the length.");
                   System.out.print("Input your desired width: ");
                   Width=myScanner.next();
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
       int w=Integer.parseInt(Width);
       
       int g=L%(2*w);
       int h=L/w;
       
       for(int m=0;m<w;m++){
           for(int k=0;k<L;k++){
               for(int s=0;s<h;s=s+2){
                if((k-s*w)==m){
                   System.out.print("#");
               }
                else if((k-s*w)==w-m){
                   System.out.print("/");
               }
               }
               for(int s=1;s<h;s=s+2){
                if((k-s*w)==w-m){
                     System.out.print("#");
                   }
                else if((k-s*w)==m){
                       System.out.print("\\");
                   }
                else{
                       System.out.print(" ");
                   }
               }
               
               
               }
               
              
             System.out.println(" ");
           }
           
      
      
       }
       
       
       
       
       
    }
