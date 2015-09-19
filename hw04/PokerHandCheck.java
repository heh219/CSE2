//////////////////////////////////////////////////////////
//Huanghe
//Homework04
//Poker hand check
//
//  first compile this program
//      javac PokerHandCheck.java
//  run the program
//      java PokerHandCheck

public class PokerHandCheck{
//define a class
public static void main(String[] args){
    //add main method
    
    System.out.println("You random cards were: ");
    
    //input random CardNumber and suits
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
    
    //input random CardNumber1 and suits1
    int CardNumber1=(int)(Math.random()*13)+1;
    int Suits1=(int)(Math.random()*4)+1;
    
    String C=" ";//String C that represents Card number from 1-13
    String D=" ";//String D that represents Card suit
    
    //define D in different conditions
    if (Suits1==1)
    D="Dimond";
    if (Suits1==2)
    D="Club";
    if (Suits1==3)
    D="Spade";
    if (Suits1==4)
    D="Heart";
    
    //switch C into string
    switch(CardNumber1){
        case 1: C="Ace";
        break;
        case 2: C="2";
        break;
        case 3: C="3";
        break;
        case 4: C="4";
        break;
        case 5: C="5";
        break;
        case 6: C="6";
        break;
        case 7: C="7";
        break;
        case 8: C="8";
        break;
        case 9: C="8";
        break;
        case 10: C="10";
        break;
        case 11: C="Jack";
        break;
        case 12: C="Queen";
        break;
        default: C="King";
        break;
    }//end of this switch
    System.out.println("You pick "+C+" of the "+D);
    
    //input random value of CardNumber2 and suits2
    int CardNumber2=(int)(Math.random()*13)+1;
    int Suits2=(int)(Math.random()*4)+1;
    
    String E=" ";//String E that represents Card number from 1-13
    String F=" ";//String F that represents Card suit
    
    //define F in different conditions
    if (Suits2==1)
    F="Dimond";
    if (Suits2==2)
    F="Club";
    if (Suits2==3)
    F="Spade";
    if (Suits2==4)
    F="Heart";
    
    //switch E into string
    switch(CardNumber2){
        case 1: E="Ace";
        break;
        case 2: E="2";
        break;
        case 3: E="3";
        break;
        case 4: E="4";
        break;
        case 5: E="5";
        break;
        case 6: E="6";
        break;
        case 7: E="7";
        break;
        case 8: E="8";
        break;
        case 9: E="8";
        break;
        case 10: E="10";
        break;
        case 11: E="Jack";
        break;
        case 12: E="Queen";
        break;
        default: E="King";
        break;
    }//end of this switch
    System.out.println("You pick "+E+" of the "+F);
    
    //input random value of CardNumber3 and suits3
    int CardNumber3=(int)(Math.random()*13)+1;
    int Suits3=(int)(Math.random()*4)+1;
    
    String U=" ";//String U that represents Card number from 1-13
    String N=" ";//String N that represents Card suit
    
    //define N in different conditions
    if (Suits3==1)
    N="Dimond";
    if (Suits3==2)
    N="Club";
    if (Suits3==3)
    N="Spade";
    if (Suits3==4)
    N="Heart";
    
    //switch U into string
    switch(CardNumber3){
        case 1: U="Ace";
        break;
        case 2: U="2";
        break;
        case 3: U="3";
        break;
        case 4: U="4";
        break;
        case 5: U="5";
        break;
        case 6: U="6";
        break;
        case 7: U="7";
        break;
        case 8: U="8";
        break;
        case 9: U="8";
        break;
        case 10: U="10";
        break;
        case 11: U="Jack";
        break;
        case 12: U="Queen";
        break;
        default: U="King";
        break;
    }//end of this switch
    System.out.println("You pick "+U+" of the "+N);
    
    //input random value of CardNumber4 and suits4
    int CardNumber4=(int)(Math.random()*13)+1;
    int Suits4=(int)(Math.random()*4)+1;
    
    String O=" ";//String A that represents Card number from 1-13
    String W=" ";//String B that represents Card suit
    
    //define W in different conditions
    if (Suits4==1)
    W="Dimond";
    if (Suits4==2)
    W="Club";
    if (Suits4==3)
    W="Spade";
    if (Suits4==4)
    W="Heart";
    
    //switch O into string
    switch(CardNumber4){
        case 1: O="Ace";
        break;
        case 2: O="2";
        break;
        case 3: O="3";
        break;
        case 4: O="4";
        break;
        case 5: O="5";
        break;
        case 6: O="6";
        break;
        case 7: O="7";
        break;
        case 8: O="8";
        break;
        case 9: O="8";
        break;
        case 10: O="10";
        break;
        case 11: O="Jack";
        break;
        case 12: O="Queen";
        break;
        default: O="King";
        break;
    }//end of this switch
    System.out.println("You pick "+O+" of the "+W);
    
    int q=0;//to count number of pairs
    if (CardNumber1==CardNumber2){
        q=q+1;
        
    }
        else if (CardNumber1==CardNumber3){
            q=q+1;
        
        }
        else if (CardNumber1==CardNumber4){
            q=q+1;
        
        }
        else if (CardNumber1==CardNumber){
            q=q+1;
        
        }
        else if (CardNumber==CardNumber2){
            q=q+1;
        
        }
        else if (CardNumber1==CardNumber3){
            q=q+1;
        
        }
        else if (CardNumber==CardNumber4){
            q=q+1;
        
        }
        else if (CardNumber2==CardNumber3){
            q=q+1;
        
        }
        else if (CardNumber2==CardNumber4){
            q=q+1;
       
        }
        else if (CardNumber3==CardNumber4){
            q=q+1;
        
        }
        else{
        System.out.println("You have a high hand card!");
        }
    if (q==1){
        System.out.println("You have a pair!");
    }
        else if (q==2){
            System.out.println("You have two pairs!");
        }
        else if (q==3){
            System.out.println("You have three of a kind!");
        }
        else if (q==4){
            System.out.println("You have four of a kind!");
        }
        else if (q==5){
            System.out.println("You are so lucky! You have five of a kind!");
        }
    }//end of this method
}//end of this class