import java.util.Scanner;

public class Battery {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
      if ((a>=100)) {
       System.out.println("full battery");        
      }else if(a==50){
        System.out.println("50% battery");
      }else{
        System.out.println("low battery");
      }
    }
}
