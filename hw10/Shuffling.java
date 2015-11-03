///////////////////////////////////
/*He Huang
HomeWork 10
Shuffling
Nov.1*/

//first compile this program
//    javac Shuffling.java
//run this program
//    java Shuffling
import java.util.Scanner;
//define a class
public class Shuffling{
    //add a main method
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};//define array suitNames
     String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
     //define array rankNames
     String[] cards = new String[52];//define length of array cards
     String[] hand = new String[5];//define length of array hand
      //make a whole poker card with respect to order
      for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        System.out.print(cards[i]+" ");
     }
     System.out.println("");//print space to seprate each card
    
     
     
     shuffle(cards);
     printArray(cards);
     hand = randomizeHand(cards);
     printArray(hand);

    }//end of main method

    public static void printArray(String[] cards){
        //make space between each index in array
        for(int i=0;i<cards.length;i++){
            System.out.print(cards[i]+" ");
        }
        System.out.println("");
    }//end of printArray method
    
    public static void shuffle(String[] cards){
        int number = cards.length;//calculate length of cards array
        System.out.println("Shuffled");//printout title
        for(int i=0;i<number;i++){
            //get random number of card
            int change = (int)(Math.random()*number);
        //shuffling
        String temp = cards[change];
        cards[change]=cards[i];
        cards[i]=temp;
        }
        return;
    }//end of shuffle method
    
   public static String[] randomizeHand(String[] cards){
        
        int number = cards.length;//calculate the length of array cards
        boolean exam = true;//define a exam
        int[] index = new int[5];//define the index of random 5 cards
        String[] hand = new String[5];//define new array of 5 cards
        while(exam==true){
            //get 5 random card from array cards
             index[0]=(int)(Math.random()*number);
             index[1]=(int)(Math.random()*number);
             index[2]=(int)(Math.random()*number);
             index[3]=(int)(Math.random()*number);
             index[4]=(int)(Math.random()*number);
             //make sure those 5 cards are not same
            if(index[0]!=index[1]&&index[0]!=index[2]&&index[0]!=index[3]&&index[0]!=index[4]&&index[1]!=index[2]&&index[1]!=index[3]&&index[1]!=index[4]&&index[3]!=index[4]){
                for(int i=0;i<5;i++){
                //define array hand
                hand[i]=cards[index[i]];
                
                }
                exam=false;
                //change exam to stop while loop
            }
            else{
                //continue while loop if above condition does not satisify
                exam=true;
            }
        }
        System.out.println("RandomizeHand Card!");//print out the title
        return hand;//return array hand
   }//end of randomizeHand method  
}//end of the calss
