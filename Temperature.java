import java.util.Scanner;

public class Temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a>=100)
       {
        System.out.println("high fever");
       }else{
        System.out.println("low fever");
       }
    }
}