//////////////////////////////////////////////////
/*He Huang
Lab 08
Stats
Oct. 16*/

//first compile the program
//    javac Stats.java
//run this program
//    java Stats

import java.util.Scanner;
//define a class
public class Stats{
    //add main method
    
        public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a double: ");
        double input1 = myScanner.nextDouble();//input double 
        int x=1;
        System.out.print("Please enter a double: ");
        double input2 = myScanner.nextDouble();
        while(x==1){//do the while loop
        if(input2<=input1){//check input value
            System.out.print("Please enter a double larger than previous one: ");
            input2 = myScanner.nextDouble();//input double
            x=1;//continue to do while loop and check input value
        }
        else{
            x--;//stop while loop
        }
        }//end while loop
        x=1;
        System.out.print("Please enter a double: ");
        double input3 = myScanner.nextDouble();//input double
        while(x==1){//do the while loop
        if(input3<=input2){//check input value
            System.out.print("Please enter a double larger than previous one: ");
            input3 = myScanner.nextDouble();//input double
            x=1;//continue to do while loop and check input value
        }
        else{
            x--;//stop while loop
        }
        }//end while loop
        x=1;
        System.out.print("Please enter a double: ");
        double input4 = myScanner.nextDouble();//input double
        while(x==1){//do the while loop
        if(input4<=input3){//check input value
            System.out.print("Please enter a double larger than previous one: ");
            input4 = myScanner.nextDouble();//input double
            x=1;//continue to do while loop and check input value
        }
        else{
            x--;//stop while loop
        }
        }//end while loop
        x=1;
        System.out.print("Please enter a double: ");
        double input5 = myScanner.nextDouble();//input double
        while(x==1){//do the while loop
        if(input5<=input4){//check input value
            System.out.print("Please enter a double larger than previous one: ");
            input5 = myScanner.nextDouble();//input double
            x=1;//continue to do while loop and check input value
        }
        else{
            x--;//stop while loop
        }
        }//end while loop
        
        
        double M = Mean(input1,input2,input3,input4,input5);
            
            System.out.println("The mean value is "+ M);//print out mean
        
        
        double m = Median(input3);
        System.out.println("The median value is "+m);//print out median
        }
        //add a method
        public static double Mean(double input1, double input2, double input3, double input4, double input5){
          
         
          return (input1+input2+input3+input4+input5)/5;//return the result
        } 
        //add a method
        public static double Median(double input3){
            
            return input3;
        }
          
        



        





        
    }
