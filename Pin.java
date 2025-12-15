import java.util.Scanner;

public class Pin {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int pin=sc.nextInt();
       int tot=1234;
       if(pin==tot){
        System.out.println("allow withdraw");
       }else{
        System.out.println("not allowed");
       }
      
    }
}
