//////////////////////////////////////////////////
/*He Huang
Homework 08
Area
Oct. 18*/

//first compile this program
//    javac BarGraph.java
//run this program
//    java BarGraph

import java.util.Scanner;
//define a class
public class Area{
    //add a main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("what you prefer following shapes to calculate its are?");
        System.out.print("triangle, rectangle or circle: ");
        String shape = myScanner.next();
        while(!shape.equals("triangle")&&!shape.equals("circle")&&!shape.equals("rectangle")){//check the input string until input valid string
            System.out.print("Please enter valid shape, including triangle, circle and rectangle: ");
            shape = myScanner.next();
        }
        if(shape.equals("triangle")){//check the condition when input is triangle
            System.out.print("Please enter height of triangle: ");
            String height = myScanner.next();
            while(Input(height)!=0){//check if the input is valid
                   System.out.print("Please enter valid number: ");
                   height = myScanner.next(); 
            }
            double H = Double.parseDouble(height);//convert string into double
            System.out.print("Please enter the width of the triangle: ");
            String width = myScanner.next();
            while(Input(width)!=0){//check is the input is valid
                System.out.print("Please enter valid number: ");
                width = myScanner.next(); 
            }
            double W = Double.parseDouble(width);//convert string into double
            double Area = Triangle(H,W);//calculate Area
            System.out.println("the area of triangle is "+Area);
            
            
        }
        else if(shape.equals("rectangle")){//check if input is rectangle
            System.out.print("Please enter width of the rectangle: ");
            String w = myScanner.next();
            while(Input(w)!=0){//chekc if input is valid
                System.out.print("Please enter valid number: ");
                w = myScanner.next(); 
            }
            double x = Double.parseDouble(w);//convert string into double
            System.out.print("Please enter the length of rectangle: ");
            String length = myScanner.next();
            while(Input(length)!=0){//check is input is valid
                System.out.print("Please enter valid number: ");
                length = myScanner.next(); 
            }
            double L = Double.parseDouble(length);//convert string into double
            double Area = Rectangle(x,L);//calculate the area
            System.out.println("the area of the rectangle is "+Area);
        }
        
        
        else if(shape.equals("circle")){//check is input string is circle
            System.out.print("Please enter radius of the circle: ");
            String radius = myScanner.next();
            while(Input(radius)!=0){//check is the input is valid
                System.out.print("Please enter valid number: ");
                radius = myScanner.next(); 
            }
            double R = Double.parseDouble(radius);//convert string into double
            double Area=Circle(R);//calculate the area
            System.out.println("the area of the circle is "+Area);
            
        }
        
        
        
        
    }


     public static int Input(String input){
                int n = 0;
                int result = 0;
                for (int a =0;a<input.length();a++){//define for loop of number of letters of input string MondayCost
                 if(Character.isDigit(input.charAt(a))||input.charAt(a)=='.'){//check condition
                  n=0;}//define n and end if function
                  else{
                      n++;}//define n and end else
            }//end if function and for loop
            if (n!=0){//check condition of count variables n
         result = 1;
            }
            return result;
    }
   
    public static double Triangle(double height, double width){
        double Area = height*width/2;//define Area
        return Area;//return the Area of triangle
    }
    
    public static double Rectangle(double length, double width){
        double Area = length*width;//define Area
        return Area;//return the area of rectangle
    }
    
    public static double Circle(double radius){
        double Area = 3.14*radius*radius;
        return Area;//return the Area of circle
    }
    
    
}