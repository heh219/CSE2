///////////////////////////////////////////////////////////////
/*Huang he*/
/*Lab06 Getting Loopy*/
/*Oct. 2*/


//first compile this program
//    javac GettingLoopy.java
//run this program
//    java GettingLoopy

//define a class
public class GettingLoopy{
    //add main method
    public static void main(String[] args){
        System.out.println("Step 1: ");//print out the titel of step 1
        int n=0;//input int n
        while (n+1<=7){//run a while loop
        System.out.print(n+1);//print out the array from 1 to 7
        n++;// redefine n
        if (n==7){// check the condition
        System.out.println("777777");// print out array 777777 
        }
        }
        //end while loop
        System.out.println("Step 2: ");//print out the title of step 2
        System.out.print("For loop: ");//print out the tille of first loop title
        
        for(int i=10;i<=100;i++){//run a for loop 
        int num=0;//input int num to count
          for(int j=2;j<i;j++){//run another for loop
             if(i%j==0){//check this condition
             num++;//define num
             }//end if statement
           }//end for loop
            if(num==0){//check this condition
            System.out.print(i+" ");//print out number which is prime
            }//end if statement
       }//end for loop
      
        System.out.println(" ");//print a space
        System.out.print("While loop: ");//print second title of second loop
        n=10;//define n
        int c,i;//int c and i to count
        while(n<100){//check while loop condition
            c=0;//define c
            i=2;//define i
            while(i<(n/2)){//check while loop condition
                if(n%i==0){//check if statement
                    c++;//define c
                }//end if function
            i++;}//end while loop
            if(c==0){//check if statement
                System.out.print(" "+n);//print result
            }//end if function
        n++;//define n
        }//end while loop
        
        System.out.println(" ");//print space to start new line
        System.out.print("DO While loop: ");//print titile
        n=10;//define n
        do{//do while loop
            c=0;//define c
            i=2;//define i
          do{if(n%i==0){//check if statement and do while loop
             c++;//define c
            }//end if function
            i++;//define i
            }while(i<(n/2));//end do while loop if i<(n/2)
        if(c==0){//check if statement
            System.out.print(" "+n);}//print result and end if statement
            n++;//define n
       }while(n<100);//end do while loop if n<100
        
        System.out.println(" ");//print a space to start a new line
        
        
        System.out.println("Step 3: ");//print the title
        int number = (int)(Math.random()*200)+1;//pick random number from 1-200
        int d=0;//input d to count
        int k=number%20;//get reminder
        int h=number-k;//get mutiples of 20
        while(h>0){//check while loop condition
            while(d<20){//check while loop condition
            System.out.print("ツ");//print out result 
            
            d++;}//define n and end while loop
            
            if(d==20){//chekc d value
                System.out.println(" ");//print a space to start a new line
             d=0;//define d value
            }//end if function
         h=h-20;//define h
            
        }//end while loop
        
        while(k>0){//check k value
            System.out.print("ツ");//print out result
            k--;//define k
        }
        System.out.println(" ");//print a space to start a new line
        
        
    }//end of method
}//ennd of class