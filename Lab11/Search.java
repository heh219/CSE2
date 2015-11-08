/////////////////////////////////////////////
/*Huang He
Lab11
Search
Nov. 6*/

//first compile the program
//    javac Search.java
//run this program
//    java Search


import java.util.Scanner;
//define a class
public class Search{
    //add a main method
    public static void main(String args[]){
        int[] Array1 = new int[5000];//define lenth of array1
        int[] Array2 = new int[5000];//define lenth of array2
        for(int i=0;i<Array1.length;i++){
            Array1[i]=(int)(Math.random()*100000);//give array1 value
        }
        
        int min = Array1[0];//define min 
        int max = Array1[0];//define max
        
        for(int i=1; i<Array1.length;i++){
            if(Array1[i]<min){
                min = Array1[i];//change mininum value
            }
        }
        System.out.println("The minimum of array1 is "+ min);
        for(int i=1; i<Array1.length;i++){
            if(Array1[i]>max){
                max = Array1[i];//change max value
            }
        }
        System.out.println("The maximum of array1 is "+ max);
        
        
        Array2[0]=(int)(Math.random()*100000);//inital value of Array2[0]
        for(int i=1;i<(Array2.length);i++){//check each array in Array2
            int value = (int)(Math.random()*100000);//take random number
            while(value>0){//while loop conditon
                if(value>Array2[i-1]){
                    Array2[i]=value;//give i index in Array2 value
    
                    break;//break here and end
                }
                
                else{
                    value = (int)(Math.random()*100000);//retake value
            }
            
            }
        }
        System.out.println("The maximum of array2 is " + Array2[Array2.length-1]);
        System.out.println("The minimum of array2 is " + Array2[0]);
        
        
        Scanner myScanner = new Scanner(System.in);
        boolean positive = true;//define a loop to control while loop
        while(positive == true){//do this while loop on the true condition
        System.out.print("Enter an int: ");
        int integer = myScanner.nextInt();
        if(integer>=0){
            int low = 0;//index of initial low
            int high = Array2.length-1;//index of initial high
            while(high>=low){//while condition
              int middle = (high+low)/2;//define middle value
              if(Array2[low]==integer){
                  System.out.println("The number was found in the postion Array2["+low+"]");
                  break;//break here and end
              }
              if(Array2[high]==integer){
                  System.out.println("The number was found in the postion Array2["+high+"]");
                  break;//break here and end
              }
              if(Array2[middle]==integer){
                  System.out.println("The number was found in the position Array2["+middle+"]");
                  break;//break here and end
              }
              if(Array2[middle]<integer){
                  low = middle+1;//redefine low
              }
              if(Array2[middle]>integer){
                  high = middle-1;//redefin ehigh
              }
              if(high<low){
                  System.out.println(integer+"was not found in Array2.");
                
                  if(Array2[0]<integer){
                  for(int i=0;i<Array2.length;i++){
                    if(Array2[i]>integer){
                        System.out.println("The number above the key is "+Array2[i]);
                        System.out.println("The number below the key is"+Array2[i-1]);
                        break;//break here and end
                    }
                  }
                  }
                  if(Array2[0]>integer){
                      System.out.println("The number above the key is "+Array2[0]);
                      break;//break here and end
                  }
                  if(Array2[4999]<integer){
                      System.out.println("The number below the key is "+Array2[4999]);
                      break;//break here and end
                  }
              }
            }//end of while loop
            break;//break while loop
        }
        else{
            positive = true;//continue while loop
        }
        }//end of while loop
        
        
    
        
        
    }//end of this method
}//end of this class