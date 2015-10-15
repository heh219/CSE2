public class E{
    public static void main(String[]args){
        for(int m=0;m<4;m++){
            for(int k=0;k<4;k++){
                if(k==m){
                    System.out.print("#");
                }
                else if(k==4-m){
                    System.out.print("/");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        }
    }
