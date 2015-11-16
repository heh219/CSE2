import java.util.Scanner;
public class E{
public static void main(String args[]){
    /*Scanner myScanner = new Scanner(System.in);
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
    }*/
    /*int[] array = new int[5];
    array[0]=3;
    array[1]=9;
    array[2]=1;
    array[3]=8;
    array[4]=5;
    System.out.println(array);
    for(int i =0;i<array.length-1;i++){
        if(array[i]>array[i+1]){
            int temp = array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            System.out.print(array[i]+" ");
            
        }
        
    }
    
public static int [] sort(int[] asd) {
        int[] sorted = asd;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                if ( (sorted[i] > sorted[j]) && (i != j) ) {
                    int temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
                
            }
        }
        
        return sorted;
    }

   /* public static int findMode(int[] sorted) {
        // do whatever you want to do here...
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {3,2,5,4,1,1,1,1,10,9};
        
        int[] potato = sort(array);
        for (int i = 0; i < potato.length; i++) {
            System.out.print(potato[i] + ",");
        }
        System.out.println();
        //System.out.print(findMode(potato));
    }*/
       int number = (int)(Math.random()*10)+10;
        System.out.println("N"+number);
        int[][] newArray = new int[number][];
        int size;
        for(int n=0;n<number;n++){
            size = (int)(Math.random()*10)+10;
            newArray[n]=new int[size];
            System.out.println(size+" : ");
          for(int i=0;i<size;i++){
            int value=(int)(Math.random()*2000)-1000;
            newArray[n][i]=value;
            System.out.print(value+" ");
          }
          System.out.println("");
        }
}
}


