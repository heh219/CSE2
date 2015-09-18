//////////////////////////////////////////////////////////
//Huanghe
//Lab03
//Card Generator
//
//  first compile this program
//      javac CardGenerator.java
//  run the program
//      java CardGenerator

public class CardGenerator{
//define a class
public static void main(String[] args){
    //add main method
    
    //define A and B through picking random numbers
    int CardNumber=(int)(Math.random()*13)+1;
    int Suits=(int)(Math.random()*4)+1;
    
    String A=" ";//String A that represents Card number from 1-13
    String B=" ";//String B that represents Card suit
    
    //define B in different conditions
    if (Suits==1)
    B="Dimond";
    if (Suits==2)
    B="Club";
    if (Suits==3)
    B="Spade";
    if (Suits==4)
    B="Heart";
    
    //switch A into string
    switch(CardNumber){
        case 1: A="Ace";
        break;
        case 2: A="2";
        break;
        case 3: A="3";
        break;
        case 4: A="4";
        break;
        case 5: A="5";
        break;
        case 6: A="6";
        break;
        case 7: A="7";
        break;
        case 8: A="8";
        break;
        case 9: A="8";
        break;
        case 10: A="10";
        break;
        case 11: A="Jack";
        break;
        case 12: A="Queen";
        break;
        default: A="King";
        break;
    }//end of this switch
    System.out.println("You pick "+A+" of the "+B);

}//end of this method
    
    
}//end of this class