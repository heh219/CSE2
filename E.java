import java.util.Scanner;
public class E{
public static void main(String args[]){
    Scanner myScanner = new Scanner(System.in);
    System.out.print("input = ");
    int i = myScanner.nextInt();
    int k = 0;
    for(k=0;k<i;k++){
        for(int j=0;j<i;j++){
            if(j==k){
                System.out.print("\\");
            }
            else if(j>k){
                System.out.print("+");
            }
            else{
                System.out.print("o");
            }
        }
        System.out.println("");
    }
}
}