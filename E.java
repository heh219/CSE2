import java.util.Scanner;
public class E{            //main method required for every Java program
  public static void main(String[] args){
 Scanner input = new Scanner ( System.in );              //declare that input is a variable of type Scanner
 
 System.out.println("Please enter a 10 digit barcode:");
 String bar = input.next();
char ch;
int dig=0, sum=0, k=10;
 
 while(bar.length() != 10){
 System.out.println("This is NOT a valid ISBN. Please enter 10 digits:");
 bar = input.next();
 }


for(int i=0; i<bar.length(); i++)
{
ch=bar.charAt(i);
if(ch=='X')
    dig=10;
else
    dig=ch-48;
sum=sum+dig*k;
k--;
}

 
 int check = sum % 11;
 
 for (int n=0;n<9;n++){
   if(Character.isLetter((bar.charAt(n)))){
   System.out.println("This is NOT a valid ISBN.Please enter 10 digits:");
   bar = input.next();
   }
 }
 
 if((int)bar.charAt(9) == check){
 System.out.println("This is a valid ISBN.");
 }
 
 else if((0<check) &&(check <10)){
 System.out.println("This is NOT a valid ISBN.Check digit should be " + check);
 }
 else {
 System.out.println("This is NOT a valid ISBN.Check digit should be X ");
 }
  }
}