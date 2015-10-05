public class E{
    public static void main(String[]args){
        int n=10;
        int i=2;
        int c=0;
        while(n<100){
            while(i<(n/2)){
                if(n%i==0){
                    c++;
                }
            
            i++;}
            if(c==0){
                System.out.print(" "+n);
            }
        
        n++;}
    }
}