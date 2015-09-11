///////////////////////////////////////////
//Huanghe
//hw03
//Block
//
//  first compile this program
//      javac Block.java
//  run the program
//      java Block

import java.util.Scanner;
//define a class
public class Block{
    //main method required in every java program
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter the length of the block in the form x.x: ");
        double blockLength = myScanner.nextDouble();
        System.out.print("enter the width of the block in the form x.x: ");
        double blockWidth = myScanner.nextDouble();
        System.out.print("enter the height of the block in the form x.x: ");
        double blockHeight = myScanner.nextDouble();
        double blockVolume, blockSurface;
        blockVolume = blockHeight*blockWidth*blockLength;
        blockSurface = 2*blockWidth*blockHeight+2*blockHeight*blockLength+2*blockLength*blockWidth;
        System.out.println("The volume of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume);
        System.out.println("The surface area of the block is "+blockSurface);
    }//end of this mehod
    
}//end of this class