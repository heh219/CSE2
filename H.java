import java.util.Scanner;
//define a class
public class H{
    //add a main mathod
    public static void main (String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Expenses for Monday: $");
        String MondayCost=myScanner.next();
        
        /*int n=0;
        int x=1;
        while(x==1){
        for (int i =0;i<MondayCost.length();i++){
            if(Character.isLetter(MondayCost.charAt(i))){
            n++;}
            else{
                n=n;
            }}
            
            if (n!=0){
            System.out.print("Please enter valid cost: $");
                MondayCost=myScanner.next();
                x=1;
                n=0;}
            else{
                x--;
            }    
        }*/
        
        
        int j=1;
        while(j==1){
            int n=0;
        int x=1;
        while(x==1){
        for (int i =0;i<MondayCost.length();i++){
            if(Character.isLetter(MondayCost.charAt(i))){
            n++;}
            else{
                n=n;
            }}
            
            if (n!=0){
            System.out.print("Please enter valid cost: $");
                MondayCost=myScanner.next();
                x=1;
                n=0;}
            else{
                x--;
            }    
        }
            double Monday=Double.parseDouble(MondayCost);
            if(Monday<0){
                System.out.print("Please enter positive number: $");
                MondayCost=myScanner.next();
                 n=0;
                 x=1;
                while(x==1){
                  for (int i =0;i<MondayCost.length();i++){
                   if(Character.isLetter(MondayCost.charAt(i))){
                    n++;}
                   else{
                    n=n;
            }}
            
               if (n!=0){
                 System.out.print("Please enter valid cost: $");
                 MondayCost=myScanner.next();
                 x=1;
                 n=0;}
               else{
                x--;
            }    
        }
                
            }
            else{
                j--;
            }
        }
        double Monday=Double.parseDouble(MondayCost);
        System.out.println(Monday*2);
                
            
                /*else{
                    double Monday=Double.parseDouble(MondayCost);
                }*/
            
        
        
        
    }
}
