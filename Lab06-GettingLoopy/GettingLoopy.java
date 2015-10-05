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
        
       /* int x=10;//input value of n
        int y=2;//input value of y
        int p=0;
        while (x<=100){
            while(y<x){
              if(x%y==0){
                p++;  
                  }
              else if(x%y!=0){
                p=p;
              }
            y++;
            }
        x++;
        }
        if(p==0){
            System.out.print(x + " ");
        }
        System.out.println(" ");
        */
        System.out.println("Step 3: ");
        int number = (int)(Math.random()*200)+1;
        int d=1;
        while(d<=20&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d<20&&d<=40&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>40&&d<=80&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>80&&d<=100&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>100&&d<=120&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>120&&d<=140&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>140&&d<=160&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>160&&d<=180&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        while(d>180&&d<=200&&d<=number){
            System.out.print("ツ");
            d++;
        }
        System.out.println(" ");
        
    }
}
        
        
        
    
