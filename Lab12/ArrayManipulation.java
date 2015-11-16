/////////////////////////////
/*Huang He
Lab 12
Array Manipulation
Nov. 13*/

//first compile this program
//javac ArrayManipulation.java
//run this program
//java ArrayManipulation

//define a class
public class ArrayManipulation{
    
    //add a main method
    public static void main(String args[]){
    int[][] Ragged = raggedArray();
    printArray(Ragged);
    findSmallest(Ragged);
    findLargest(Ragged);
    mostEven(Ragged);
        
    }//main method is to run several methods below

    //add a method
    public static int[][] raggedArray(){
        int number = (int)(Math.random()*10)+10;//define the range of array
        int[][] newArray = new int[number][];
        for(int n=0;n<number;n++){
            
            int size = (int)(Math.random()*10)+10;//define each size of a array
            newArray[n]=new int[size];
          for(int i=0;i<size;i++){
            newArray[n][i]=(int)(Math.random()*2000)-1000;//define the range of digit in each array
          }
        }
        return newArray;
    }//this method is to make a random size with random integers of a two dimensional array
    
    //add a method
    public static void printArray(int[][] array){
        int number = array.length;
        for(int i=0;i<number;i++){
            int size = array[i].length;
            for(int n=0;n<size;n++){
                    System.out.print(array[i][n]+" ");
                }
                System.out.println("");
            }
        
        System.out.println("");
    }//thie method is to print out the two dimensional array we get
    
    //add a method
    public static void findSmallest(int[][] array){
        int min = array[0][0];
        int number = array.length;
        for(int i=0;i<number;i++){
            int size = array[i].length;
            for (int n=0;n<size;n++){
                if(array[i][n]<min){
                    min=array[i][n];
                }
            }
        }
        System.out.println("the smallest value is "+ min);
        
    }//this method is to find the smallest in the array
    
    //add a method
    public static void findLargest(int[][] array){
        int max = array[0][0];
        int number = array.length;
        for(int i=0;i<number;i++){
            int size = array[i].length;
            for (int n=0;n<size;n++){
                if(array[i][n]>max){
                    max=array[i][n];
                }
            }
        }
        System.out.println("the largest value is "+max);
    }//this method is to find the largest in the array
    
    //add a method
    public static void mostEven(int[][] array){
        int number = array.length;
        int[] Even = new int[number*20];//supposed all members of arrya is even, then the largest ranged is number*20
        int x=0;
        for(int i=0;i<number;i++){
            int size = array[i].length;
            
            for (int n=0;n<size;n++){
                if(array[i][n]%2==0){
                    Even[x]=array[i][n];
                    x++;
                    }
                
                
            }
        }
        int length = x-1;;
        int max = Even[0];
        for(int j=0;j<length;j++){
            if(Even[j]>max){
                max=Even[j];
            }
        }
        System.out.println("the most even number is "+max);
    }//this method is to find the largest even number in array


}//end of this class
