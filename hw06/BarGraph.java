//////////////////////////////////////
/*Huanghe
HomeWork 06
BarGraph
Oct. 4*/

//first compile this program
//    javac BarGraph.java
//run this program
//    java BarGraph

import java.util.Scanner;
//define a class
public class BarGraph{
    //add a main mathod
    public static void main (String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Expenses for Monday: $");//print out title
        String MondayCost=myScanner.next();//input string
        int j=1;//input j to run or stop while loop
        while(j==1){//check condition of while loop
            int n=0;//input n to count
            int x=1;//input x to run ot stop inner while loop
            while(x==1){//check condition of inner while loop
               for (int i =0;i<MondayCost.length();i++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(MondayCost.charAt(i))){//check condition
                  n++;}//define n and end if function
                 else{//check is above condition is not satisified
                  n=n;//define n
            }}//end if function and for loop
            if (n!=0){//check condition of count variables n
            System.out.print("Sorry, you did not enter an integer. Try again: $");//print if above condition satisified
                MondayCost=myScanner.next();//input string
                x=1;//define x
                n=0;}//define n and end if function
            else{//check if above condition is not satisified
                x--;//define x
            }//end else    
        }//end while loop
            double Monday=Double.parseDouble(MondayCost);//convert string into double
            if(Monday<0){//check double condition
                System.out.print("Please enter positive number: $");//print result
                MondayCost=myScanner.next();//input string
                 n=0;//define n
                 x=1;//define x
                while(x==1){//check x
                  for (int i =0;i<MondayCost.length();i++){//define for loop of number of letter of MondayCost String
                   if(Character.isLetter(MondayCost.charAt(i))){//check condition
                    n++;}//defien n and end if
                   else{//check is above condition is not satisified
                    n=n;//define n
            }}//end of else and end of for loop
            
               if (n!=0){//check condition
                 System.out.print("Sorry, you did not enter an integer. Try again: $");//print result
                 MondayCost=myScanner.next();//input string
                 x=1;//define x
                 n=0;}//define n and end if 
               else{//check if above condition is not satisified
                x--;//define x
            }//end else    
        }//end while loop
            }//end if function
            else{//check if if is not satisified
                j--;//define j
            }//end else
        }//end while loop
        double Monday=Double.parseDouble(MondayCost);//convert string into double
        
        
        System.out.print("Expenses for Tuesday: $");
        String TuesdayCost=myScanner.next();
        j=1;
        while(j==1){
            int n1=0;
            int x1=1;
            while(x1==1){
               for (int i1 =0;i1<TuesdayCost.length();i1++){
                 if(Character.isLetter(TuesdayCost.charAt(i1))){
                  n1++;}
                 else{
                  n1=n1;
            }}
            if (n1!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                TuesdayCost=myScanner.next();
                x1=1;
                n1=0;}
            else{
                x1--;
            }    
        }
            double Tuesday=Double.parseDouble(TuesdayCost);
            if(Tuesday<0){
                System.out.print("Please enter positive number: $");
                TuesdayCost=myScanner.next();
                 n1=0;
                 x1=1;
                while(x1==1){
                  for (int i1 =0;i1<TuesdayCost.length();i1++){
                   if(Character.isLetter(TuesdayCost.charAt(i1))){
                    n1++;}
                   else{
                    n1=n1;
            }}
            
               if (n1!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 TuesdayCost=myScanner.next();
                 x1=1;
                 n1=0;}
               else{
                x1--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Tuesday=Double.parseDouble(TuesdayCost);
        
        
        System.out.print("Expenses for Wednesday: $");
        String WednesdayCost=myScanner.next();
         j=1;
        while(j==1){
            int n2=0;
            int x2=1;
            while(x2==1){
               for (int i2 =0;i2<WednesdayCost.length();i2++){
                 if(Character.isLetter(WednesdayCost.charAt(i2))){
                  n2++;}
                 else{
                  n2=n2;
            }}
            if (n2!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                WednesdayCost=myScanner.next();
                x2=1;
                n2=0;}
            else{
                x2--;
            }    
        }
            double Wednesday=Double.parseDouble(WednesdayCost);
            if(Wednesday<0){
                System.out.print("Please enter positive number: $");
                WednesdayCost=myScanner.next();
                 n2=0;
                 x2=1;
                while(x2==1){
                  for (int i2 =0;i2<WednesdayCost.length();i2++){
                   if(Character.isLetter(WednesdayCost.charAt(i2))){
                    n2++;}
                   else{
                    n2=n2;
            }}
            
               if (n2!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 WednesdayCost=myScanner.next();
                 x2=1;
                 n2=0;}
               else{
                x2--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Wednesday=Double.parseDouble(WednesdayCost);
        
        System.out.print("Expenses for Thursday: $");
        String ThursdayCost=myScanner.next();
        j=1;
        while(j==1){
            int n3=0;
            int x3=1;
            while(x3==1){
               for (int i3 =0;i3<ThursdayCost.length();i3++){
                 if(Character.isLetter(ThursdayCost.charAt(i3))){
                  n3++;}
                 else{
                  n3=n3;
            }}
            if (n3!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                ThursdayCost=myScanner.next();
                x3=1;
                n3=0;}
            else{
                x3--;
            }    
        }
            double Thursday=Double.parseDouble(ThursdayCost);
            if(Thursday<0){
                System.out.print("Please enter positive number: $");
                ThursdayCost=myScanner.next();
                 n3=0;
                 x3=1;
                while(x3==1){
                  for (int i3 =0;i3<ThursdayCost.length();i3++){
                   if(Character.isLetter(ThursdayCost.charAt(i3))){
                    n3++;}
                   else{
                    n3=n3;
            }}
            
               if (n3!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 ThursdayCost=myScanner.next();
                 x3=1;
                 n3=0;}
               else{
                x3--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Thursday=Double.parseDouble(ThursdayCost);
        
        System.out.print("Expenses for Friday: $");
        String FridayCost=myScanner.next();
        j=1;
        while(j==1){
            int n4=0;
            int x4=1;
            while(x4==1){
               for (int i4 =0;i4<FridayCost.length();i4++){
                 if(Character.isLetter(FridayCost.charAt(i4))){
                  n4++;}
                 else{
                  n4=n4;
            }}
            if (n4!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                FridayCost=myScanner.next();
                x4=1;
                n4=0;}
            else{
                x4--;
            }    
        }
            double Friday=Double.parseDouble(FridayCost);
            if(Friday<0){
                System.out.print("Please enter positive number: $");
                FridayCost=myScanner.next();
                 n4=0;
                 x4=1;
                while(x4==1){
                  for (int i4 =0;i4<FridayCost.length();i4++){
                   if(Character.isLetter(FridayCost.charAt(i4))){
                    n4++;}
                   else{
                    n4=n4;
            }}
            
               if (n4!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 FridayCost=myScanner.next();
                 x4=1;
                 n4=0;}
               else{
                x4--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Friday=Double.parseDouble(FridayCost);
        
        System.out.print("Expenses for Saturday: $");
        String SaturdayCost=myScanner.next();
        j=1;
        while(j==1){
            int n5=0;
            int x5=1;
            while(x5==1){
               for (int i5 =0;i5<SaturdayCost.length();i5++){
                 if(Character.isLetter(SaturdayCost.charAt(i5))){
                  n5++;}
                 else{
                  n5=n5;
            }}
            if (n5!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                SaturdayCost=myScanner.next();
                x5=1;
                n5=0;}
            else{
                x5--;
            }    
        }
            double Saturday=Double.parseDouble(SaturdayCost);
            if(Saturday<0){
                System.out.print("Please enter positive number: $");
                SaturdayCost=myScanner.next();
                 n5=0;
                 x5=1;
                while(x5==1){
                  for (int i5 =0;i5<SaturdayCost.length();i5++){
                   if(Character.isLetter(SaturdayCost.charAt(i5))){
                    n5++;}
                   else{
                    n5=n5;
            }}
            
               if (n5!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 SaturdayCost=myScanner.next();
                 x5=1;
                 n5=0;}
               else{
                x5--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Saturday=Double.parseDouble(SaturdayCost);
        
        System.out.print("Expenses for Sunday: $");
        String SundayCost=myScanner.next();
        j=1;
        while(j==1){
            int n6=0;
            int x6=1;
            while(x6==1){
               for (int i6 =0;i6<SundayCost.length();i6++){
                 if(Character.isLetter(SundayCost.charAt(i6))){
                  n6++;}
                 else{
                  n6=n6;
            }}
            if (n6!=0){
            System.out.print("Sorry, you did not enter an integer. Try again: $");
                SundayCost=myScanner.next();
                x6=1;
                n6=0;}
            else{
                x6--;
            }    
        }
            double Sunday=Double.parseDouble(SundayCost);
            if(Sunday<0){
                System.out.print("Please enter positive number: $");
                SundayCost=myScanner.next();
                 n6=0;
                 x6=1;
                while(x6==1){
                  for (int i6 =0;i6<SundayCost.length();i6++){
                   if(Character.isLetter(SundayCost.charAt(i6))){
                    n6++;}
                   else{
                    n6=n6;
            }}
            
               if (n6!=0){
                 System.out.print("Sorry, you did not enter an integer. Try again: $");
                 SundayCost=myScanner.next();
                 x6=1;
                 n6=0;}
               else{
                x6--;
            }    
        }
            }
            else{
                j--;
            }
        }
        double Sunday=Double.parseDouble(SundayCost);
        
        
        
        
        double AverageCost;//input double
        AverageCost=(Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;//define double 
        
        System.out.print("Mon: ");
        while(Monday>=0.5){
            System.out.print("*");
            Monday--;
        }
        System.out.println(" ");//print blank to start new columue
        
        System.out.print("Tues: ");
        while(Tuesday>=0.5){
            System.out.print("*");
            Tuesday--;
        }
        System.out.println(" ");
        
        System.out.print("Wed: ");
        while(Wednesday>=0.5){
            System.out.print("*");
            Wednesday--;
        }
        System.out.println(" ");
        
        System.out.print("Thu: ");
        while(Thursday>=0.5){
            System.out.print("*");
            Thursday--;
        }
        System.out.println(" ");
        
        System.out.print("Fri: ");
        while(Friday>=0.5){
            System.out.print("*");
            Friday--;
        }
        System.out.println(" ");
        
        System.out.print("Sat: ");
        while(Saturday>=0.5){
            System.out.print("*");
            Saturday--;
        }
        System.out.println(" ");
        
        System.out.print("Sun: ");
        while(Sunday>=0.5){
            System.out.print("*");
            Sunday--;
        }
        System.out.println(" ");
        
        //precise double Average into hundreds
        AverageCost=AverageCost*100;
        AverageCost=Math.round(AverageCost);
        AverageCost=AverageCost/100;
        System.out.println("You average weekly expense are: "+ AverageCost);
        
        
        double EstimateWeekCost;//double value
        double EstimateTotalCost=AverageCost;//double value
        int Weeks=208;//int number of week
        while(Weeks>0){//check condition
            double PossiblePercent=(double)(-20+Math.random()*40);//pick random number
            EstimateWeekCost=AverageCost*((100+PossiblePercent)/100);//define double
            EstimateTotalCost=EstimateTotalCost+EstimateWeekCost;//define double
            //precise double EstimateTotalCost into hundreds
            EstimateTotalCost=EstimateTotalCost*100;
            EstimateTotalCost=Math.round(EstimateTotalCost);
            EstimateTotalCost=EstimateTotalCost/100;
            Weeks--;
        }
        
        System.out.println("Estimate expenditure for 4 years: "+ EstimateTotalCost);//print result
        
    }//end of method
}//end of class