//////////////////////////////////////
//Huang He
//ArithmeticCaculations
//
//  first compile the program
//     javac ArithmeticCalculations.java
//  run the program
//     java ArithmeticCalculations//
//  define a class
public class ArithmeticCalculations{
    
//  add a main method
  public static void main(String[] args){
       
       //print the statement with box around it
       //Number of pairs of socks
         int nSocks=3;//
       //Cost per pair of socks
       //('$' is part of the variable name)
         double sockCost$=2.58;//
       //Number of drinking glasses
         int nGlasses=6;//
       //Cost per galss
         double galssCost$=2.29;//
       //Number of box of envelopes
         int nEnvelopes=1;//
       //cost per bpx of envelopes
         double envelopeCost$=3.25;//
         double taxpercent=0.06;//
         double totalcostSocks, totalcostGlass, totalcostEnvelope, totalCost;//
         

         System.out.println("the total cost of socks is "+
         (nSocks*sockCost$));
         System.out.println("the total cost of glasses is "+
         (nGlasses*galssCost$));
         System.out.println("the total cost of envelopes is "+
         (nEnvelopes*envelopeCost$));
         totalcostSocks=nSocks*sockCost$;
         totalcostEnvelope=nEnvelopes*envelopeCost$;
         totalcostGlass=nGlasses*galssCost$;
         totalCost=totalcostGlass+totalcostEnvelope+totalcostSocks;
         System.out.println("the total cost before tax is "+(totalCost));
         System.out.println("the actual cost is "+(totalCost*(1+taxpercent)));
         
  //test//testtest
  
  }

}