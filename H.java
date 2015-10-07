import java.util.Scanner;
//define a class
public class H{
    //add a main mathod
    public static void main (String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Please enter a 10 digit barcode: ");
        String Code = myScanner.next();
        if(Code.length()!=10){
            System.out.print("Please enter 10 digits: ");
            Code = myScanner.next();
        }
        
        int f=StringCode.indexOf("x");
            
        int n=0;//input n to count
        int x=1;//input x to run ot stop inner while loop
         while(x==1){//check condition of inner while loop
              for (int i =0;i<Code.length();i++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(Code.charAt(i))||Character.isDigit(Code.charAt(i))){//check condition
                  n=n;}//define n and end if function
                 else{//check is above condition is not satisified
                  n++;//define n
                     }//end else
              }//end for loop
         
         if(n!=0){
                  System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
                  Code = myScanner.next();
              x=1;}
         else if(n==0){
                  x--;
              }
         }
        
        
        
    
}
}