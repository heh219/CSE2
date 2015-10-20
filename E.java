import java.util.Scanner;
public class E{            //main method required for every Java program
  public static void main(String[] args){
 Scanner myScanner = new Scanner ( System.in );              //declare that input is a variable of type Scanner
        System.out.print("Please enter: ");
        String height = myScanner.next();
        int x=1;
        while(x==1){
            int l=1;
            int n=0;
            x=1;
          while(l==1){
             n=0;
             x=1;
            while(x==1){//check condition of inner while loop
                 for (int a =0;a<height.length();a++){//define for loop of number of letters of input string MondayCost
                 if(Character.isLetter(height.charAt(a))){//check condition
                  n++;}//define n and end if function
                 else{//check is above condition is not satisified
                  n=n;//define n
            }}//end if function and for loop
            if (n!=0){//check condition of count variables n
            System.out.println(" Error: please type height in an interger.");
            System.out.print("Input your desired height:  ");//print if above condition satisified
                height=myScanner.next();//input string
                x=1;//define x
                n=0;
            }//define n and end if function
            else{
                x--;
            }
    }
    l--;
    }
    }
        
    }
}