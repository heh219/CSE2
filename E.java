public class E{
    public static void main(String[]args){
        int n=10,i,c;
        
        while(n<100){
            c=0;
            i=2;
            while(i<(n/2)){
                if(n%i==0){
                    c++;
                }
            i++;}
            if(c==0){
                System.out.print(" "+n);
            }
            
                n++;
            
        }
        
        System.out.println(" ");
        
        n=10;
        do{
            c=0;
            i=2;
          do{if(n%i==0){
             c++;
            }
            i++;
            }while(i<(n/2));
        if(c==0){
            System.out.print(" "+n);}
            n++;
        
    }while(n<100);
        }
    }
